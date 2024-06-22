# Jewelry Auction Management System

A brief description of what this project does and who it's for.

## Table of Contents
1. [Introduction](#introduction)
2. [Installation](#installation)
3. [Usage](#usage)
4. [Contributing](#contributing)
5. [Team Members](#team-members)
6. [Task Assignments](#task-assignments)
7. [License](#license) 

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
# Navigate to the frontend directory
cd your-repository-name/frontend

# Install dependencies
npm install

# Run the React application
npm run dev
# Start the backend server
cd backend
./mvnw spring-boot:run

# Start the frontend server
cd frontend
npm run dev



# Run the Spring Boot application
./mvnw spring-boot:run
