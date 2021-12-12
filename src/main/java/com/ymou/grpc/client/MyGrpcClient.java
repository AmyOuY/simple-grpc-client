package com.ymou.grpc.client;

import com.ymou.grpc.HelloRequest;
import com.ymou.grpc.HelloResponse;
import com.ymou.grpc.HelloServiceGrpc;
import com.ymou.grpc.HelloServiceGrpc.HelloServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MyGrpcClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
		
		HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
		
		HelloRequest request = HelloRequest.newBuilder()
				.setName("Tim")
				.setAge(15)
				.addHobbies("Travel")
				.addHobbies("Cook")
				.putBagOfTricks("Singing", "not very good")
				.build();
		
		HelloResponse response = stub.greet(request);
		
		System.out.println(response);
		
		channel.shutdown();
				
	}
}
