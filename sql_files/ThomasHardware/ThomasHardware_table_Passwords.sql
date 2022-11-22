
-- --------------------------------------------------------

--
-- Table structure for table `Passwords`
--

CREATE TABLE `Passwords` (
  `PwdID` int(11) NOT NULL,
  `UserID` varchar(9) NOT NULL,
  `Pwd` varchar(36) DEFAULT NULL,
  `SQA` varchar(100) DEFAULT NULL,
  `Answer` varchar(100) DEFAULT NULL,
  `RequestedPwdReset` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Passwords`
--

INSERT INTO `Passwords` (`PwdID`, `UserID`, `Pwd`, `SQA`, `Answer`, `RequestedPwdReset`) VALUES
(12, '000000000', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(13, 'AW007', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(14, 'CH004', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(15, 'CR0011', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(16, 'CT001', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(17, 'DM0010', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(18, 'JL003', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(19, 'KW009', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(20, 'RC0012', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(21, 'SB0019', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0),
(22, 'SC008', 'password', 'Where do I work?', 'Thomas Hardware Emporium', 0);
