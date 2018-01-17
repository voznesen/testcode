<?php
$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */

while(!feof($_fp)) {
  $lines[] = fgets($_fp);
}
fclose($_fp);

$count = $lines[0];
$numbers = explode(" ", $lines[1]);
$weights = explode(" ", $lines[2]);
$weight = 0;

$sumWeightedNumbers = 0;

for ($i = 0; $i < $count; $i++) {
    $sumWeightedNumbers += $numbers[$i] * $weights[$i];
    $weight += $weights[$i];
}

$d = (float)$sumWeightedNumbers/(float) $weight;

echo number_format($d, 1);

?>

