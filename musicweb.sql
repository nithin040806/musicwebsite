-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2024 at 04:25 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `musicweb`
--

-- --------------------------------------------------------

--
-- Table structure for table `favourites`
--

CREATE TABLE `favourites` (
  `favourites_id` int(11) NOT NULL,
  `music_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `pageurl` varchar(255) DEFAULT NULL,
  `postercardurl` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `favourites`
--

INSERT INTO `favourites` (`favourites_id`, `music_id`, `user_id`, `pageurl`, `postercardurl`) VALUES
(20, 2, 2, 'Vellake', 'https://c.saavncdn.com/040/Vellake-Telugu-2023-20230510195047-500x500.jpg'),
(21, 1, 2, 'AyudhaPooja', 'https://c.saavncdn.com/313/Devara-Part-1-Telugu-Telugu-2024-20240926171010-500x500.jpg'),
(22, 7, 2, 'SuttamlaSoosi', 'https://c.saavncdn.com/000/Gangs-Of-Godavari-Telugu-2024-20240530193901-500x500.jpg'),
(23, 9, 2, 'PushpaPushpa', 'https://c.saavncdn.com/601/Pushpa-Pushpa-From-Pushpa-2-The-Rule-Telugu-Telugu-2024-20240501161044-500x500.jpg'),
(24, 17, 2, 'AasaKooda', 'https://c.saavncdn.com/772/Aasa-Kooda-from-Think-Indie-Tamil-2024-20240613052402-500x500.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `music`
--

CREATE TABLE `music` (
  `musicid` int(11) NOT NULL,
  `genere` varchar(255) DEFAULT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `music_name` varchar(255) DEFAULT NULL,
  `musicurl` varchar(1000) DEFAULT NULL,
  `pageurl` varchar(255) DEFAULT NULL,
  `postercardurl` varchar(255) DEFAULT NULL,
  `posterurl` varchar(255) DEFAULT NULL,
  `relaseyear_integer` int(11) DEFAULT NULL,
  `language` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `music`
--

INSERT INTO `music` (`musicid`, `genere`, `movie_name`, `music_name`, `musicurl`, `pageurl`, `postercardurl`, `posterurl`, `relaseyear_integer`, `language`) VALUES
(1, 'Action', 'Devara', 'AyudhaPooja', 'http://localhost/project/Songs/telugusongs/AyudhaPooja.mp3', 'AyudhaPooja', 'https://c.saavncdn.com/313/Devara-Part-1-Telugu-Telugu-2024-20240926171010-500x500.jpg', 'https://c.saavncdn.com/313/Devara-Part-1-Telugu-Telugu-2024-20240926171010-500x500.jpg', 2024, 'telugu'),
(2, 'Romance', NULL, 'Vellake', 'http://localhost/project/Songs/telugusongs/Vellake.mp3', 'Vellake', 'https://c.saavncdn.com/040/Vellake-Telugu-2023-20230510195047-500x500.jpg', 'https://c.saavncdn.com/040/Vellake-Telugu-2023-20230510195047-500x500.jpg', 2023, 'telugu'),
(3, 'Action', 'SaripodhaaSanivaaram ', 'GaramGaram', 'http://localhost/project/Songs/telugusongs/Garam%20Garam.mp3', 'GaramGaram', 'https://c.saavncdn.com/536/Saripodhaa-Sanivaaram-Original-Motion-Picture-Soundtrack-Telugu-2024-20240828160005-500x500.jpg', 'https://c.saavncdn.com/536/Saripodhaa-Sanivaaram-Original-Motion-Picture-Soundtrack-Telugu-2024-20240828160005-500x500.jpg', 2024, 'telugu'),
(4, 'Romance', '3', 'PoVePo', 'http://localhost/project/Songs/telugusongs/PoVePo.mp3', 'PoVePo', 'https://c.saavncdn.com/244/3-Telugu-2012-500x500.jpg', 'https://c.saavncdn.com/244/3-Telugu-2012-500x500.jpg', 2012, 'telugu'),
(5, 'Romance', 'Om Bheem Bush', 'Anuvanuvuu', 'http://localhost/project/Songs/telugusongs/Anuvanuvuu.mp3', 'Anuvanuvuu', 'https://c.saavncdn.com/000/Om-Bheem-Bush-Telugu-2024-20240401231417-500x500.jpg', 'https://c.saavncdn.com/000/Om-Bheem-Bush-Telugu-2024-20240401231417-500x500.jpg', 2024, 'telugu'),
(6, 'Romance', 'Devara', 'Chuttamalle', 'http://localhost/project/Songs/telugusongs/Chuttamalle.mp3', 'Chuttamalle', 'https://c.saavncdn.com/313/Devara-Part-1-Telugu-Telugu-2024-20240926171010-500x500.jpg', 'https://c.saavncdn.com/313/Devara-Part-1-Telugu-Telugu-2024-20240926171010-500x500.jpg', 2024, 'telugu'),
(7, 'Romance', 'Gangs Of Godavari', 'SuttamlaSoosi', 'http://localhost/project/Songs/telugusongs/Suttamla%20Soosi.mp3', 'SuttamlaSoosi', 'https://c.saavncdn.com/000/Gangs-Of-Godavari-Telugu-2024-20240530193901-500x500.jpg', 'https://c.saavncdn.com/000/Gangs-Of-Godavari-Telugu-2024-20240530193901-500x500.jpg', 2024, 'telugu'),
(8, 'Romance', 'Ishq', 'OhPriya', 'http://localhost/project/Songs/telugusongs/Oh%20Priya%20Priya.mp3', 'OhPriyaPriya', 'https://c.saavncdn.com/057/Ishq-Telugu-2012-500x500.jpg', 'https://c.saavncdn.com/057/Ishq-Telugu-2012-500x500.jpg', 2012, 'telugu'),
(9, 'Action', 'Pushpa 2 The Rule', 'PushpaPushpa', 'http://localhost/project/Songs/telugusongs/Pushpa%20Pushpa%20-%20Pushpa%202.mp3', 'PushpaPushpa', 'https://c.saavncdn.com/601/Pushpa-Pushpa-From-Pushpa-2-The-Rule-Telugu-Telugu-2024-20240501161044-500x500.jpg', 'https://c.saavncdn.com/601/Pushpa-Pushpa-From-Pushpa-2-The-Rule-Telugu-Telugu-2024-20240501161044-500x500.jpg', 2024, 'telugu'),
(10, 'Action', 'Guntur Kaaram', 'KurchiMadathapetti', 'http://localhost/project/Songs/telugusongs/Kurchi%20Madathapetti.mp3', 'KurchiMadathapetti', 'https://c.saavncdn.com/000/Guntur-Kaaram-Telugu-2023-20240126145901-500x500.jpg', 'https://c.saavncdn.com/000/Guntur-Kaaram-Telugu-2023-20240126145901-500x500.jpg', 2023, 'telugu'),
(11, 'Action', 'Hunter Vantaar', 'HunterVantaar', 'http://localhost/project/Songs/tamilsongs/Hunter%20Vantaar.mp3', 'HunterVantaar', 'https://c.saavncdn.com/156/Hunter-Vantaar-From-Vettaiyan-Tamil-2024-20240920102831-500x500.jpg', 'https://c.saavncdn.com/156/Hunter-Vantaar-From-Vettaiyan-Tamil-2024-20240920102831-500x500.jpg', 2024, 'tamil'),
(12, 'Action', 'Leo', 'OrdinaryPerson', 'http://localhost/project/Songs/tamilsongs/Ordinary%20Person.mp3', 'OrdinaryPerson', 'https://c.saavncdn.com/916/Ordinary-Person-From-Leo-Tamil-2023-20231023221744-500x500.jpg', 'https://c.saavncdn.com/916/Ordinary-Person-From-Leo-Tamil-2023-20231023221744-500x500.jpg', 2023, 'tamil'),
(13, 'Action', 'Master', 'VaathiComing', 'http://localhost/project/Songs/tamilsongs/Vaathi%20Coming.mp3', 'VaathiComing', 'https://c.saavncdn.com/347/Master-Tamil-2020-20200316084627-500x500.jpg', 'https://c.saavncdn.com/347/Master-Tamil-2020-20200316084627-500x500.jpg', 202, 'tamil'),
(14, 'Action', 'Jailer', 'Hukum', 'http://localhost/project/Songs/tamilsongs/Hukum.mp3', 'Hukum', 'https://c.saavncdn.com/187/Jailer-Tamil-2023-20230728081443-500x500.jpg', 'https://c.saavncdn.com/187/Jailer-Tamil-2023-20230728081443-500x500.jpg', 2022, 'tamil'),
(15, 'Melody', 'Vikram Vedha', 'Yaanji', 'http://localhost/project/Songs/tamilsongs/Yaanji.mp3', 'Yaanji', 'https://c.saavncdn.com/933/Vikram-Vedha-Tamil-2017-20221230053937-500x500.jpg', 'https://c.saavncdn.com/933/Vikram-Vedha-Tamil-2017-20221230053937-500x500.jpg', 2017, 'tamil'),
(16, 'Action', 'Vikram', 'Vikram', 'http://localhost/project/Songs/tamilsongs/Vikram%20Title%20Track.mp3', 'Vikram', 'https://c.saavncdn.com/973/Vikram-Tamil-2022-20220515182605-500x500.jpg', 'https://c.saavncdn.com/973/Vikram-Tamil-2022-20220515182605-500x500.jpg', 2022, 'tamil'),
(17, 'Action', '', 'AasaKooda', 'http://localhost/project/Songs/tamilsongs/Aasa%20Kooda.mp3', 'AasaKooda', 'https://c.saavncdn.com/772/Aasa-Kooda-from-Think-Indie-Tamil-2024-20240613052402-500x500.jpg', 'https://c.saavncdn.com/772/Aasa-Kooda-from-Think-Indie-Tamil-2024-20240613052402-500x500.jpg', 2024, 'tamil'),
(18, 'Action', '', 'KatchiSera', 'http://localhost/project/Songs/tamilsongs/Katchi%20Sera.mp3', 'KatchiSera', 'https://c.saavncdn.com/118/Katchi-Sera-from-Think-Indie-Tamil-2024-20240122043105-500x500.jpg', 'https://c.saavncdn.com/118/Katchi-Sera-from-Think-Indie-Tamil-2024-20240122043105-500x500.jpg', 2024, 'tamil'),
(19, 'Romance', 'Paiya', 'ThuliThuli', 'http://localhost/project/Songs/tamilsongs/Thuli%20Thuli.mp3', 'ThuliThuli', 'https://c.saavncdn.com/984/Paiya-Tamil-2010-20200620134043-500x500.jpg', 'https://c.saavncdn.com/984/Paiya-Tamil-2010-20200620134043-500x500.jpg', 2010, 'tamil'),
(20, 'Action', 'The Greatest Of All Time', 'Matta', 'http://localhost/project/Songs/tamilsongs/MATTA.mp3', 'Matta', 'https://c.saavncdn.com/829/The-Greatest-Of-All-Time-Tamil-Tamil-2024-20240903191033-500x500.jpg', 'https://c.saavncdn.com/829/The-Greatest-Of-All-Time-Tamil-Tamil-2024-20240903191033-500x500.jpg', 2024, 'tamil'),
(21, 'Action', 'Aavesham', 'Illuminati', 'http://localhost/project/Songs/malayalamsongs/Illuminati.mp3', 'Illuminati', 'https://c.saavncdn.com/858/Aavesham-Malayalam-2024-20240514204401-500x500.jpg', 'https://c.saavncdn.com/858/Aavesham-Malayalam-2024-20240514204401-500x500.jpg', 2024, 'malayalam'),
(22, 'Melody', 'Hridayam', 'Darshana', 'http://localhost/project/Songs/malayalamsongs/Darshana%20Hridayam.mp3', 'Darshana', 'https://c.saavncdn.com/371/Hridayam-Malayalam-2021-20230803205617-500x500.jpg', 'https://c.saavncdn.com/371/Hridayam-Malayalam-2021-20230803205617-500x500.jpg', 2021, 'malayalam'),
(23, 'Melody', 'Gauthamante Radham', 'Uyire', 'http://localhost/project/Songs/malayalamsongs/Uyire.mp3', 'Uyire', 'https://c.saavncdn.com/335/Gauthamante-Radham-Malayalam-2020-20211130230913-500x500.jpg', 'https://c.saavncdn.com/335/Gauthamante-Radham-Malayalam-2020-20211130230913-500x500.jpg', 2020, 'malayalam'),
(24, 'Action', 'King of Kotha ', 'KothaRaja', 'http://localhost/project/Songs/malayalamsongs/Kotha%20Raja.mp3', 'KothaRaja', 'https://c.saavncdn.com/213/King-of-Kotha-Original-Motion-Picture-Soundtrack-Malayalam-2023-20230823190149-500x500.jpg', 'https://c.saavncdn.com/213/King-of-Kotha-Original-Motion-Picture-Soundtrack-Malayalam-2023-20230823190149-500x500.jpg', 2023, 'malayalam'),
(25, 'melody', 'Premam', 'Malare', 'http://localhost/project/Songs/malayalamsongs/Malare.mp3', 'Malare', 'https://c.saavncdn.com/665/Premam-Malayalam-2015-500x500.jpg', 'https://c.saavncdn.com/665/Premam-Malayalam-2015-500x500.jpg', 2015, 'malayalam'),
(26, 'Action', 'ARM', 'Kiliye', 'http://localhost/project/Songs/malayalamsongs/Kiliye.mp3', 'Kiliye', 'https://c.saavncdn.com/504/ARM-Original-Motion-Picture-Soundtrack-Malayalam-2024-20241001211403-500x500.jpg', 'https://c.saavncdn.com/504/ARM-Original-Motion-Picture-Soundtrack-Malayalam-2024-20241001211403-500x500.jpg', 2024, 'malayalam'),
(27, 'melody', 'Manjummel Boys', 'Kuthanthram', 'http://localhost/project/Songs/malayalamsongs/Kuthanthram.mp3', 'Kuthanthram', 'https://c.saavncdn.com/623/Manjummel-Boys-Malayalam-2024-20240305111058-500x500.jpg', 'https://c.saavncdn.com/623/Manjummel-Boys-Malayalam-2024-20240305111058-500x500.jpg', 2024, 'malayalam'),
(28, 'Action', 'Thallumaala', 'ManavaalanThug', 'http://localhost/project/Songs/malayalamsongs/Manavaalan%20Thug.mp3', 'ManavaalanThug', 'https://c.saavncdn.com/017/Thallumaala-Malayalam-2022-20230110143259-500x500.jpg', 'https://c.saavncdn.com/017/Thallumaala-Malayalam-2022-20230110143259-500x500.jpg', 2020, 'malayalam'),
(29, 'Romance', 'Athiran', 'PavizhaMazha', 'http://localhost/project/Songs/malayalamsongs/Pavizha%20Mazha.mp3', 'PavizhaMazha', 'https://c.saavncdn.com/485/Athiran-Malayalam-2019-20190411181147-500x500.jpg', 'https://c.saavncdn.com/485/Athiran-Malayalam-2019-20190411181147-500x500.jpg', 2019, 'malayalam'),
(30, 'Action', 'Habibi Drip', 'HabibiDrip', 'http://localhost/project/Songs/malayalamsongs/Habibi%20Drip.mp3', 'HabibiDrip', 'https://c.saavncdn.com/359/Habibi-Drip-Malayalam-2024-20240716152747-500x500.jpg', 'https://c.saavncdn.com/359/Habibi-Drip-Malayalam-2024-20240716152747-500x500.jpg', 2024, 'malayalam');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `login`, `password`) VALUES
(1, 'nithin', 'sai'),
(2, 'nithinsai', 'a'),
(3, 'nithinsai', 'Abc@222222');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `favourites`
--
ALTER TABLE `favourites`
  ADD PRIMARY KEY (`favourites_id`);

--
-- Indexes for table `music`
--
ALTER TABLE `music`
  ADD PRIMARY KEY (`musicid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `favourites`
--
ALTER TABLE `favourites`
  MODIFY `favourites_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `music`
--
ALTER TABLE `music`
  MODIFY `musicid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
