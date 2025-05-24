#!/usr/bin/env bash

files=$(find src/main/java/no/noria/edb/kattis -type f -name "*.java")

for f in $files; do
  if [[ $1 == "download" ]]; then

    # Prepare paths
    problem=$(basename "${f%.*}" | tr '[:upper:]' '[:lower:]')
    echo "Testing" $problem
    samples_dir="samples/kattis/$problem"
    mkdir -p "$samples_dir"
    samples_zip="$samples_dir/samples.zip"
    samples_url="https://open.kattis.com/problems/$problem/file/statement/samples.zip"

    # Download samples if not already there
    if [ ! -f $samples_zip ]; then
      echo "  Downloading samples_url to $samples"
      curl -s $samples_url > $samples_zip
    else
      echo "  Samples already at $samples_zip"
    fi

    # Unzip samples_url
    unzip -q -f $samples_zip -d $samples_dir

    # Find input files
    input_files=$(find $samples_dir -type f -name "*.in")
    for input_file in $input_files; do
      input=$(cat $input_file)
      output_file=$(echo $input_file | sed 's/.in/.ans/')
      output_file_actual="$output_file.actual"
      output=$(cat $output_file)
      echo "$input" | java $f > "$output_file_actual"
      git diff $output_file $output_file_actual
    done
  fi
done
