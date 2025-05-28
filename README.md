## Overview

A RESTful API service built with Spring Boot to manage the leaderboard for a coding platform. The application uses MongoDB to persist user data.

## Features

- **User Registration**: Register a new user with a unique User ID and Username.
- **Update Score**: Update the score of a specific user.
- **Badge Awarding**: Award badges to users based on their scores.
  - 1 <= Score < 30 -> Code Ninja
  - 30 <= Score < 60 -> Code Champ
  - 60 <= Score <= 100 -> Code Master
- **User Retrieval**: Retrieve a list of all registered users.
- **User Deletion**: Deregister a specific user from the contest.

## API Endpoints

- **GET /users** - Retrieve a list of all registered users
- **GET /users/{userId}** - Retrieve the details of a specific user
- **POST /users** - Register a new user to the contest
- **PUT /users/{userId}** - Update the score of a specific user
- **DELETE /users/{userId}** - Deregister a specific user from the contest

## API Testing

For testing the API endpoints, you can use the following [Postman Collection](https://www.postman.com/lunar-module-architect-99006294/ajinkya-s-workspace/collection/cf4cnzy/coderhacker-apis?action=share&creator=28399701)
