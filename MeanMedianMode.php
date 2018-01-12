<?php
$_fp = fopen("php://stdin", "r");
/* Enter your code here. Read input from STDIN. Print output to STDOUT */

//echo fread($_fp, filesize("php://stdin"));
//$input = fread($_fp, filesize("php://stdin"));


while(!feof($_fp)) {
  $lines[] = fgets($_fp);
}
fclose($_fp);

//print_r($lines);

$num = $lines[0];
$numbers = explode(" ", $lines[1]);
//print_r($numbers);

//echo "size of numbers:" . sizeof($numbers);
$sum = 0;
for ($i = 0; $i < sizeof($numbers); $i++) {
    $sum += $numbers[$i];
}

$mean = (float) $sum / (float) $num;

echo $mean . PHP_EOL;

sort($numbers);
//print_r($numbers);
$mid = sizeof($numbers) / 2;

//echo "size " . sizeof($numbers) . PHP_EOL;
//echo "mid " . $mid . PHP_EOL;

$median = 0;
if (sizeof($numbers) % 2 == 0) {
    $median = ($numbers[$mid - 1] + $numbers[$mid]) / 2;
} else {
    $median = $numbers[$mid];
}

echo $median . PHP_EOL;

$occurCount = [];
//print_r($numbers);
for ($i = 0; $i < sizeof($numbers); $i++) {
    //echo $numbers[$i] . PHP_EOL;
       if (isset($occurCount[$numbers[$i]])) {
           $occurCount[$numbers[$i]] += 1;
       } else {
           $occurCount[$numbers[$i]] = 1;
       }
}

$mode = 0;
$count = 0;
//print_r($occurCount);

foreach ($occurCount as $num => $numCount) {
    if ($numCount > $count) {
        $count = $numCount;
        $mode = $num;
    }   
}

echo $mode . PHP_EOL;


