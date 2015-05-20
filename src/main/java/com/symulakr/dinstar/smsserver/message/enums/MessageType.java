package com.symulakr.dinstar.smsserver.message.enums;

public interface MessageType
{

   short getType();

   String getFunction();

   Direction getDirection();

   MessageType getCorrespondingType();

   enum Direction
   {
      TO_DWG,
      TO_SERVER,
      ANY
   }

}