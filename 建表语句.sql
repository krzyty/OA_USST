USE USSTOA;
#组织表
CREATE TABLE organization
(
	organizationID INT(11) PRIMARY KEY AUTO_INCREMENT,
	organizationName VARCHAR(30),
	organizationState INT(2)#1有效 2已删除
);

#部门表
CREATE TABLE department
(
	departmentID INT(11) PRIMARY KEY AUTO_INCREMENT,
	departmentName VARCHAR(30),
	belongOrganization INT(11),
	FOREIGN KEY(belongOrganization) REFERENCES organization(organizationID),
	departmentState INT(2) #1有效 2已删除
);

#员工表
CREATE TABLE users
(
	userID INT(11) PRIMARY KEY AUTO_INCREMENT,
	userName VARCHAR(20),
	userPassword VARCHAR(20),
	belongDepartment INT(11),
	FOREIGN KEY(belongDepartment) REFERENCES department(departmentID),
	userRole VARCHAR(20),
	userState INT(2) #1有效 2已删除
);

#文件表
CREATE TABLE files
(
	fileID INT(11) PRIMARY KEY AUTO_INCREMENT,
	fileName VARCHAR(30),
	fileType VARCHAR(20),
	fileDate DATETIME,
	fileSize FLOAT(15),
	uploadPerson INT(11),
	FOREIGN KEY(uploadPerson) REFERENCES users(userID),
	fileState INT(2) #1有效 2已删除
);

#出勤表
CREATE TABLE attendance
(
	attendanceID INT(11) PRIMARY KEY AUTO_INCREMENT,
	attendanceTime DATETIME,
	attendanceUser INT(11),
	FOREIGN KEY(attendanceUser) REFERENCES users(userID)
);

#消息表
CREATE TABLE message
(
	messageID INT(11) PRIMARY KEY AUTO_INCREMENT,
	messageText VARCHAR(500),
	sendUser INT(11), 
	FOREIGN KEY(sendUser) REFERENCES users(userID),
	receiveUser INT(11), 
	FOREIGN KEY(receiveUser) REFERENCES users(userID),
	sendTime DATETIME,
	messageState INT(2) #1已发送 2已删除 3已阅读 
);


#日程表
CREATE TABLE schedules
(
	scheduleID INT(11) PRIMARY KEY AUTO_INCREMENT,
	scheduleText VARCHAR(500),
	scheduleDate DATETIME,
	belongUser INT(11),
	FOREIGN KEY(belongUser) REFERENCES users(userID),
	scheduleState INT(2) #1有效 2已删除
);


#管理员表
CREATE TABLE admin
(
	adminID INT(11) PRIMARY KEY AUTO_INCREMENT,
	adminName VARCHAR(30),
	adminPassword VARCHAR(30),
	adminState INT(2) #1有效 2已删除
);