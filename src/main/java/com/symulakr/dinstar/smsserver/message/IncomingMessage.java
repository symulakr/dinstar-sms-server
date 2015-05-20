package com.symulakr.dinstar.smsserver.message;

import com.symulakr.dinstar.smsserver.utils.HeadParser;

public abstract class IncomingMessage extends AbstractMessage
{

   protected abstract void parseBody();
   public abstract OutgoingMessage createResponse();

   public short getType()
   {
      return HeadParser.getType(head);
   }

   @Override
   public int getLength()
   {
      return HeadParser.getLength(head);
   }

   public byte[] getMessageId()
   {
      return HeadParser.getMessageId(head);
   }

   @Override
   public byte[] getFlag()
   {
      return HeadParser.getFlag(head);
   }

   public void setBody(byte[] body)
   {
      this.body = body;
      parseBody();
   }

   @Override
   public String toString()
   {
      return new StringBuilder("\n===============================================\n")
            .append("Incoming Message:")
            .append(super.toString())
            .toString();
   }
}
