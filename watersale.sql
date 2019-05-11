-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 05 May 2019, 22:58:37
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `watersale`
--

DELIMITER $$
--
-- Yordamlar
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersAdd` (IN `cname` VARCHAR(255), IN `csurname` VARCHAR(255), IN `cphone` VARCHAR(255), IN `cadress` VARCHAR(255))  BEGIN
INSERT INTO costumers VALUES(NULL, cname, csurname, cphone, cadress);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersDelete` (IN `id` INT(45))  delete from costumers where cid = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersEdit` (IN `id` VARCHAR(45), IN `name` VARCHAR(255), IN `surname` VARCHAR(255), IN `phone` VARCHAR(255), IN `adress` VARCHAR(255))  BEGIN
update costumers set cname = name, csurname = surname, cphone = phone, cadress = adress where cid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersGet` (IN `id` VARCHAR(45))  BEGIN
select * from costumers where cid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersList` ()  BEGIN
SELECT * FROM costumers;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcDeliveryStatus` (IN `id` VARCHAR(45))  UPDATE orders SET ostatus = 2 WHERE oid = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcOrdersAction` (IN `name` VARCHAR(45), IN `surname` VARCHAR(45), IN `status` VARCHAR(45), IN `adress` VARCHAR(45), IN `phone` VARCHAR(45), IN `cost` VARCHAR(45))  BEGIN
INSERT INTO orders VALUES(NULL, name, surname, status, adress, phone, cost);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcOrdersAdd` (IN `oname` VARCHAR(255), IN `osurname` VARCHAR(255), IN `ophone` VARCHAR(255), IN `oadress` VARCHAR(255), IN `ocost` VARCHAR(255))  BEGIN
INSERT INTO orders VALUES(NULL, oname, osurname, ophone, oadress, ocost);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcOrdersDelete` (IN `id` VARCHAR(45))  BEGIN
delete from orders where oid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcOrdersEdit` (IN `id` VARCHAR(45), IN `orstatus` VARCHAR(45))  BEGIN
update orders set  ostatus = orstatus where oid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcOrdersList` ()  BEGIN
SELECT * FROM orders;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcPasswordEdit` (IN `password` VARCHAR(45))  BEGIN

UPDATE usersign SET upassword=password WHERE uid=1;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcSign` ()  BEGIN

select * from usersign;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `costumers`
--

CREATE TABLE `costumers` (
  `cid` int(11) NOT NULL,
  `cname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `csurname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cphone` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cadress` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `costumers`
--

INSERT INTO `costumers` (`cid`, `cname`, `csurname`, `cphone`, `cadress`) VALUES
(1, 'Ertuğrul', 'Başkaya', '5372227558', 'Fatih'),
(4, 'Ali', 'Başkanay', '5325969696', 'Pendik');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `orders`
--

CREATE TABLE `orders` (
  `oid` int(11) NOT NULL,
  `oname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `osurname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `ostatus` varchar(255) COLLATE utf8_turkish_ci NOT NULL DEFAULT '0',
  `oadress` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `ophone` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `ocost` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `orders`
--

INSERT INTO `orders` (`oid`, `oname`, `osurname`, `ostatus`, `oadress`, `ophone`, `ocost`) VALUES
(5, 'Ali', 'Başkan', '2', 'Pendik', '5325969696', '20'),
(6, 'Ertuğrul', 'Başkaya', '2', 'Fatih', '5372227558', '15'),
(7, 'Ertuğrul', 'Başkaya', '1', 'Fatih', '5372227558', '15'),
(8, 'Ali', 'Başkan', '1', 'Pendik', '5325969696', '14'),
(9, 'Ali', 'Başkan', '0', 'Pendik', '5325969696', '35'),
(10, 'Ali', 'Başkan', '0', 'Pendik', '5325969696', '15'),
(11, 'Ali', 'Başkanay', '0', 'Pendik', '5325969696', '10');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `usersign`
--

CREATE TABLE `usersign` (
  `uid` int(11) NOT NULL,
  `uname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `upassword` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `usersign`
--

INSERT INTO `usersign` (`uid`, `uname`, `upassword`) VALUES
(1, 'admin', 'admin'),
(2, 'a', 'a');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `costumers`
--
ALTER TABLE `costumers`
  ADD PRIMARY KEY (`cid`);

--
-- Tablo için indeksler `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`oid`);

--
-- Tablo için indeksler `usersign`
--
ALTER TABLE `usersign`
  ADD PRIMARY KEY (`uid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `costumers`
--
ALTER TABLE `costumers`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `orders`
--
ALTER TABLE `orders`
  MODIFY `oid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Tablo için AUTO_INCREMENT değeri `usersign`
--
ALTER TABLE `usersign`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
