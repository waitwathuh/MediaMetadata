INSERT INTO `MetaData` (`MetaDataId`, `Runtime`, `Studio`, `Year`, `ParentalRatingId`) VALUES (1, '1h 38m', 'Dream Works', '2010', 2);
INSERT INTO `MetaData` (`MetaDataId`, `Runtime`, `Studio`, `Year`, `ParentalRatingId`) VALUES (2, '1h 42m', 'Dream Works', '2014', 2);
INSERT INTO `MetaData` (`MetaDataId`, `Runtime`, `Studio`, `Year`, `ParentalRatingId`) VALUES (3, '1h 44m', 'Dream Works', '2019', 2);
INSERT INTO `MetaData` (`MetaDataId`, `Runtime`, `Studio`, `Year`, `ParentalRatingId`) VALUES (4, '22min', 'Warner Bros. Television', '1994', 2);

INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (1, 1);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (1, 2);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (1, 3);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (1, 7);

INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (2, 1);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (2, 2);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (2, 3);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (2, 4);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (2, 7);

INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (3, 1);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (3, 2);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (3, 3);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (3, 4);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (3, 7);

INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (4, 4);
INSERT INTO `MetaData_Genre` (`MetaData_MetaDataId`, `genreList_GenreId`) VALUES (4, 16);