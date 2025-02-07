
# Japtos - Java SDK for Aptos

Japtos is a Java SDK designed for interacting with the Aptos blockchain. It provides developers with the necessary tools to build applications that integrate seamlessly with Aptos, including features for account management, transactions, and smart contract interactions.

## Features

-   Create and manage Aptos accounts
    
-   Sign and send transactions
    
-   Query blockchain data
    
-   Interact with Move smart contracts
    
-   Support for Aptos REST API
    

## Installation

To use Japtos in your Java project, add the following dependency to your `pom.xml` if using Maven:

```
<dependency>
    <groupId>com.enjohub</groupId>
    <artifactId>japtos</artifactId>
    <version>1.0.0</version>
</dependency>
```

For Gradle:

```
dependencies {
    implementation 'com.enjohub:japtos:1.0.0'
}
```

## Usage

### Creating an Account

```
import com.enjohub.japtos.AptosClient;
import com.enjohub.japtos.Wallet;

AptosClient client = new AptosClient("https://fullnode.mainnet.aptoslabs.com");
Wallet wallet = new Wallet();
System.out.println("Address: " + wallet.getAddress());
```

### Sending a Transaction

```
String recipient = "0x1a2b3c...";
BigInteger amount = BigInteger.valueOf(1000000);
w.sendTransaction(recipient, amount);
```

## Contributing

We welcome contributions! Feel free to fork this repository and submit pull requests.

## License

Japtos is licensed under the MIT License.
