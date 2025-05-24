#!/usr/bin/env bash

files=$(find src/main/java/no/noria/edb/kattis -type f -name "*.java")

if [[ $1 == "download" ]]; then
  for f in $files; do
    problem=$(basename "${f%.*}" | tr '[:upper:]' '[:lower:]')
    echo "Testing" $problem
    samples_dir="samples/kattis/$problem"
    mkdir -p "$samples_dir"
    samples="$samples_dir/samples.zip"
    samples_url="https://open.kattis.com/problems/$problem/file/statement/samples.zip"
    if [ ! -f $samples ]; then
      echo "  Downloading samples_url to $samples"
      curl -s $samples_url > $samples
    else
      echo "  Samples already at $samples"
    fi

    # Unzip samples_url
    unzip -q -f $samples -d $samples_dir
  done
fi