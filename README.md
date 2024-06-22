
# Jewelry Auction Management System

A brief description of what this project does and who it's for.

## Table of Contents
1. Introduction
2. Installation
3. Usage
4. Contributing
5. Team Members
6. Task Assignments
7. License

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

```bash
# Clone the repository
git clone https://github.com/your-username/your-repository-name.git

# Navigate to the backend directory
cd your-repository-name/backend

# Install dependencies
./mvnw install

# Run the Spring Boot application
./mvnw spring-boot:run
```

### Frontend (ReactJS)

```bash
# Navigate to the frontend directory
cd your-repository-name/frontend

# Install dependencies
npm install

# Run the React application
npm run dev
```

## Usage

Examples of how to use the project.

```bash
# Start the backend server
cd backend
./mvnw spring-boot:run

# Start the frontend server
cd frontend
npm run dev
```

## Contributing

Guidelines for contributing to the project.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a pull request

## Team Members

- Alice - Project Manager
- Bob - Lead Developer
- Charlie - Frontend Developer
- Dana - Backend Developer
- Eve - QA Tester

## Task Assignments

| Task                        | Assignee  | Status       |
|-----------------------------|-----------|--------------|
| Project Planning            | Alice     | Completed    |
| Setup Project Repository    | Bob       | In Progress  |
| Design User Interface       | Charlie   | Not Started  |
| Implement Backend APIs      | Dana      | In Progress  |
| Write Unit Tests            | Eve       | Not Started  |
| Conduct Code Reviews        | All       | Ongoing      |

## License

This project is licensed under the MIT License - see the LICENSE file for details.
