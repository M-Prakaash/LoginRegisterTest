<?php 
$db_name = "dbname";
$mysql_username = "YOUR USERNAME";
$mysql_password = "YOUR PASS";
$server_name = "localhost";
$conn = mysqli_connect($server_name, $mysql_username, $mysql_password,$db_name);
 if($conn)
{
echo "Success";
}
?>