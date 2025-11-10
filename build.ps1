<# PowerShell build script to compile all Java sources with --release 21 #>
param()

Write-Host "Compiling Java sources with --release 21..."

$root = Split-Path -Parent $MyInvocation.MyCommand.Definition
$files = Get-ChildItem -Path $root -Recurse -Filter *.java | Where-Object { $_.FullName -notlike "*$root\out\*" } | ForEach-Object { $_.FullName }

if ($files.Count -eq 0) {
    Write-Host "No Java sources found."
    exit 0
}

$dest = Join-Path $root "out\classes"
New-Item -ItemType Directory -Force -Path $dest | Out-Null

# Run javac with --release 21
& javac --release 21 -d $dest $files

Write-Host "Compiled $($files.Count) source files to $dest"
