<?php
$config = [
    'db_engine' => 'mysql',
    'db_host' => 'sql204.epizy.com',
    'db_name' => 'utenti',
    'db_user' => 'utenti_',
    'db_password' => 'hDi43$Jv+*_zf%Vd',
    'db_port' => '3306',
];

$db_config = $config['db_engine'] . ":host=".$config['db_host'] . ";dbname=" . $config['db_name'] . ";dbport=" . $config['db_port'];

try {
    $pdo = new PDO($db_config, $config['db_user'], $config['db_password'], [
        PDO::MYSQL_ATTR_INIT_COMMAND => "SET NAMES utf8"
    ]);
        
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $pdo->setAttribute(PDO::ATTR_EMULATE_PREPARES, false);
} catch (PDOException $e) {
    exit("Impossibile connettersi al database: " . $e->getMessage());
}
?>