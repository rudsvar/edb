#!/usr/bin/env bash

files=$(find src/main/java/no/noria/edb/kattis -type f -name "*.java")

status=0

for f in $files; do

  # Prepare paths
  problem=$(basename "${f%.*}" | tr '[:upper:]' '[:lower:]')
  echo "🧪 Testing" $problem
  samples_dir="samples/kattis/$problem"
  mkdir -p "$samples_dir"
  samples_zip="$samples_dir/samples.zip"
  samples_url="https://open.kattis.com/problems/$problem/file/statement/samples.zip"

  # Download samples if not already there
  if [ ! -f $samples_zip ]; then
    echo "  🎣 Downloading samples_url to $samples_zip"
    curl -s $samples_url > $samples_zip
  fi

  # Unzip samples_url
  echo "  📦 Unzipping $samples_zip to $samples_dir"
  unzip -q -o $samples_zip -d $samples_dir

  # Find input files
  input_files=$(find $samples_dir -type f -name "*.in")
  for input_file in $input_files; do
    input=$(cat $input_file)
    output_file=$(echo $input_file | sed 's/\.in/\.ans/')
    output_file_actual="$output_file.actual"
    output=$(cat $output_file)
    echo "$input" | java $f > "$output_file_actual"
    output_actual=$(cat "$output_file_actual")
    if [[ "$output_actual" == "$output" ]]; then
      echo "  ✅ $input_file"
    else
      echo "  ❌ $input_file"
      status=1
    fi
  done
done

exit $status