#!/usr/bin/env bash
set -euo pipefail

echo "Compiling Java sources with --release 21..."
mkdir -p out/classes

# Collect Java sources
# Use find to gather all .java files relative to repository root
mapfile -t sources < <(find . -name "*.java" -not -path "./out/*" -print)

if [ ${#sources[@]} -eq 0 ]; then
  echo "No Java sources found."
  exit 0
fi

# Create a temporary file with list of sources for javac
tmpfile=$(mktemp)
printf "%s\n" "${sources[@]}" > "$tmpfile"

# Compile with --release 21 for compatibility
javac --release 21 -d out/classes @"$tmpfile"
rm -f "$tmpfile"

echo "Compiled ${#sources[@]} source files to out/classes"
