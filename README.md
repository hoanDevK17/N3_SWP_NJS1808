# Jewelry Auction Management System

A brief description of what this project does and who it's for.

## Table of Contents
1. Introduction
2. Installation
3. Usage
4. Contributing
5. Team Members
6. Sprints Overview
7. Task Assignments
8. SRS (Software Requirements Specification)
9. License

## Introduction

Online jewelry auction management software for the auction company.

### Features
- **Home Page**: Introduces the auction company, jewelry for auction, policies, blog sharing, etc.
- **Jewelry Search**: Buyers can search for jewelry information to participate in auctions.
- **Auction Request Management**:
  - Seller sends a jewelry auction request.
  - Staff sends a preliminary jewelry valuation to the seller and requests to send the jewelry to the company.
  - Staff confirms receipt of the jewelry.
  - Staff sends the final valuation to the manager for approval.
  - Manager approves the final valuation.
  - Staff sends the final valuation to the seller.
  - Seller confirms acceptance of the auction.
  - Manager selects an auction session for the jewelry.
- **Auction Process Management**:
  - Buyer registers to participate in the auction.
  - Buyer places a bid before the auction session opens.
  - The system selects the highest bid to start the auction session.
  - Buyer participates in the auction.
  - The system announces the auction result to the buyer.
  - Buyer makes the payment.
  - Staff delivers the jewelry to the buyer.
  - The system transfers money to the seller.
- **Auction Session Management**: Create sessions, select jewelry for sessions, assign auction staff, open/close sessions, stop sessions, view session transaction history, etc.
- **Jewelry Management**: Manage jewelry participating in auctions.
- **Transaction Fee Management**: Declare transaction fees for buyers and sellers.
- **Dashboard**: Statistical dashboard.

## Installation

### Backend (Java Spring Boot)

Clone the repository:
git clone https://github.com/hoanDevK17/JewelJoust_BE.git

Navigate to the backend directory:
cd JewelJoust_BE/backend

Install dependencies:
./mvnw install

Run the Spring Boot application:
./mvnw spring-boot:run

### Frontend (ReactJS)

Clone the repository:
git clone https://github.com/hoanDevK17/JewelJoust_FE.git

Navigate to the frontend directory:
cd JewelJoust_FE/frontend

Install dependencies:
npm install

Run the React application:
npm run dev

## Usage

Examples of how to use the project.

Start the backend server:
cd backend
./mvnw spring-boot:run

Start the frontend server:
cd frontend
npm run dev

## Contributing

Guidelines for contributing to the project.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a pull request

## Team Members

- Nguyễn Hoan - SE170243
- Trần Tấn Phát - SE170312
- Đỗ Minh Quang - SE170316
- Trần Lê Trung Trường - SE173154
- Phạm Minh Long - SE161578
- Hồ Huy Hưng - SE173110

## Task Assignments
### Sprint 1: Setup
- Nguyễn Hoan : US3
- Trần Tấn Phát:US4
- Đỗ Minh Quang:US2
- Trần Lê Trung Trường:
- Phạm Minh Long:US1
- Hồ Huy Hưng:
## Sprints Overview

### Sprint 1: Setup
- Focus: System environment setup and basic configuration
- Epics: Environment Setup, Initial Project Configuration

### Sprint 2: Business Flow
- Focus: Core business processes and user interactions
- Epics: Jewelry Submission and Valuation, Auction Scheduling and Execution, Auction Participation and Result Notification

### Sprint 3: Reports
- Focus: Report generation and accuracy
- Epics: Seller Reports, Buyer Reports, Admin and Overall Auction Reports

### Sprint 4: Dashboard
- Focus: Dashboard functionality and real-time data visualization
- Epics: Real-time Statistics Dashboard, User-Specific Dashboards, Admin Dashboard and Alerts
## SRS (Software Requirements Specification)
https://docs.google.com/document/d/1DMFsP5bhomK9VnVptUYFUH6j9FFTqyHAr9cyv1TxTrM/edit?usp=sharing
## License

This project is licensed under the MIT License - see the LICENSE file for details.
