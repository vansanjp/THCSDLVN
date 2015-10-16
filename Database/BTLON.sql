CREATE TABLE IF NOT EXISTS `BT_LON`.`Restaurant` (
	`RID` VARCHAR(8) NOT NULL,
	`RestaurantName` VARCHAR(45) NOT NULL,
	`Address` VARCHAR(20) NOT NULL,
	`PhoneNumber` VARCHAR(15) NOT NULL,
	`Facebook` VARCHAR(30) NOT NULL,
	`Rate` FLOAT NOT NULL,
	`ResName` VARCHAR(45) NOT NULL,
	`ResPass` VARCHAR(45) NOT NULL,
	PRIMARY KEY (`RID`)
);

-- -----------------------------------------------------
-- Table `BT_LON`.`Menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BT_LON`.`Menu` (
	`FID` VARCHAR(8) NOT NULL,
	`FoodName` VARCHAR(30) NOT NULL,
	PRIMARY KEY (`FID`)
);

-- -----------------------------------------------------
-- Table `BT_LON`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BT_LON`.`Account` (
	`AID` VARCHAR(8) NOT NULL,
	`FullName` VARCHAR(45) NOT NULL,
	`UserName` VARCHAR(30) NOT NULL,
	`Password` VARCHAR(20) NOT NULL,
	`PhoneNumber` VARCHAR(15) NOT NULL,
	`Facebook` VARCHAR(30) NOT NULL,
	PRIMARY KEY (`AID`)
);

-- -----------------------------------------------------
-- Table `BT_LON`.`Provide`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BT_LON`.`Provide` (
	`RID` VARCHAR(8) NOT NULL,
	`FID` VARCHAR(8) NOT NULL,
	`Cost` FLOAT NOT NULL,
	PRIMARY KEY (`RID`, `FID`),
	FOREIGN KEY (`FID`) REFERENCES `BT_LON`.`Menu` (`FID`),
	FOREIGN KEY (`RID`) REFERENCES `BT_LON`.`Restaurant` (`RID`)
);


-- -----------------------------------------------------
-- Table `BT_LON`.`Reservations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BT_LON`.`Reservations` (
	`RID` VARCHAR(8) NOT NULL,
	`AID` VARCHAR(8) NOT NULL,
	`FoodList` VARCHAR(80) NOT NULL,
	`Time` DATETIME NOT NULL,
	PRIMARY KEY (`RID`, `AID`),
	FOREIGN KEY (`AID`) REFERENCES `BT_LON`.`Account` (`AID`),
	FOREIGN KEY (`RID`) REFERENCES `BT_LON`.`Restaurant` (`RID`)
);


-- -----------------------------------------------------
-- Table `BT_LON`.`FoodShip`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `BT_LON`.`FoodShip` (
	`AID` VARCHAR(8) NOT NULL,
	`RID` VARCHAR(8) NOT NULL,
	`FoodList` VARCHAR(80) NOT NULL,
	`ShipAddress` VARCHAR(45) NOT NULL,
	`Time` DATETIME NOT NULL,
	PRIMARY KEY (`AID`, `RID`),
	FOREIGN KEY (`RID`) REFERENCES `BT_LON`.`Restaurant` (`RID`),
	FOREIGN KEY (`AID`) REFERENCES `BT_LON`.`Account` (`AID`)
);