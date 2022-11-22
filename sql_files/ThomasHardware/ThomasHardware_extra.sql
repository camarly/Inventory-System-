
--
-- Indexes for dumped tables
--

--
-- Indexes for table `Customer`
--
ALTER TABLE `Customer`
  ADD PRIMARY KEY (`CustomerID`);

--
-- Indexes for table `Item`
--
ALTER TABLE `Item`
  ADD PRIMARY KEY (`ItemID`),
  ADD UNIQUE KEY `ItemID` (`ItemID`),
  ADD UNIQUE KEY `ItemDescription` (`ItemDescription`);

--
-- Indexes for table `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD PRIMARY KEY (`OrderItemId`),
  ADD KEY `OrderSaleID` (`OrderSaleID`),
  ADD KEY `ItemID` (`ItemID`);

--
-- Indexes for table `Passwords`
--
ALTER TABLE `Passwords`
  ADD PRIMARY KEY (`PwdID`),
  ADD UNIQUE KEY `PwdID` (`PwdID`),
  ADD KEY `UserID` (`UserID`);

--
-- Indexes for table `SaleOrder`
--
ALTER TABLE `SaleOrder`
  ADD PRIMARY KEY (`OrderSaleID`),
  ADD KEY `CustomerID` (`CustomerID`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `UserID` (`UserID`),
  ADD UNIQUE KEY `EmployeeNo` (`EmployeeNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `OrderItems`
--
ALTER TABLE `OrderItems`
  MODIFY `OrderItemId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `Passwords`
--
ALTER TABLE `Passwords`
  MODIFY `PwdID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `SaleOrder`
--
ALTER TABLE `SaleOrder`
  MODIFY `OrderSaleID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `OrderItems`
--
ALTER TABLE `OrderItems`
  ADD CONSTRAINT `orderitems_ibfk_1` FOREIGN KEY (`OrderSaleID`) REFERENCES `SaleOrder` (`OrderSaleID`),
  ADD CONSTRAINT `orderitems_ibfk_2` FOREIGN KEY (`ItemID`) REFERENCES `Item` (`ItemID`);

--
-- Constraints for table `Passwords`
--
ALTER TABLE `Passwords`
  ADD CONSTRAINT `passwords_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `Users` (`UserID`);

--
-- Constraints for table `SaleOrder`
--
ALTER TABLE `SaleOrder`
  ADD CONSTRAINT `saleorder_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`CustomerID`);
