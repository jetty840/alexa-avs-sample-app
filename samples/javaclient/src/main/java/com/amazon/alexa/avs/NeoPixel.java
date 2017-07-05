/** 
 * Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License"). You may not use this file 
 * except in compliance with the License. A copy of the License is located at
 *
 *   http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 */
package com.amazon.alexa.avs;

import java.net.*;

public class NeoPixel {
    public static void change(String animation) {
        try {
                String host = "127.0.0.1";
                int port = 9999;
                byte[] message=animation.getBytes();

		// Get the address
                InetAddress address = InetAddress.getByName(host);
		
		// Create the packet
                DatagramPacket packet = new DatagramPacket(message, message.length, address, port);

		// Create the socket and send the packet
                DatagramSocket dsocket = new DatagramSocket();
                dsocket.send(packet);
                dsocket.close();
        } catch (Exception e) {
                System.err.println(e);
        }
    }
}
