# Java Customer Program

## What the Program Does

This is a Java command-line program that collects basic information for two customers.

The program creates a `Customer` object for each customer and stores the objects in an `ArrayList`. The `ArrayList` stores references to the `Customer` objects.

After collecting the information, the program prints all of the stored customer information.

## Customer Information

The program collects:

* Name
* Address
* Phone Number
* Email

## How to Build and Run with Docker

### Build the Docker Image

Open a terminal in the root folder of the project and run:

```bash
docker build -t blah-java-cli .
```

### Run the Docker Container

After the image has been built, run:

```bash
docker run --rm -it blah-java-cli
```

The program will ask the user to enter information for two customers.

## Example Input

```text
Enter information for Customer 1
Name: Ethan
Address: 300 Highland Avenue
Phone Number: 4752570051
Email: ethan@example.com

Enter information for Customer 2
Name: Gregory
Address: 320 Highland Avenue
Phone Number: 7342146345
Email: gregory@example.com
```

## Example Output

```text
===== CUSTOMER INFORMATION =====
Name: Ethan
Address: 300 Highland Avenue
Phone Number: 4752570051
Email: ethan@example.com
-------------------------------
Name: Gregory
Address: 320 Highland Avenue
Phone Number: 7342146345
Email: gregory@example.com
-------------------------------
```
