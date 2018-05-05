/*
 * Copyright (C) TBA BV
 * All rights reserved.
 * www.tba.nl
 */
package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import event.Event;

/**
 * Util for serializing and deserializing event objects.
 * 
 * @author Geraj
 */
public class EventSerializationUtil {

  /**
   * 
   * Converts event to byte array
   * 
   * @param event
   * @return
   */
  public static byte[] toByteArray(Event event) {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutput out = null;
    byte[] eventBytes = null;
    try {
      out = new ObjectOutputStream(bos);
      out.writeObject(event);
      out.flush();
      eventBytes = bos.toByteArray();
    } catch (IOException e) {
      // TODO Add your own exception handling here, consider logging
      e.printStackTrace();
    } finally {
      try {
        bos.close();
      } catch (IOException ex) {
        // ignore close exception
      }
    }
    return eventBytes;
  }

  /**
   * 
   * Converts byte array to event
   * 
   * @param array
   * @return
   * @throws IOException
   */
  public static Event createEventFromByteArray(byte[] array) {
    ByteArrayInputStream bis = new ByteArrayInputStream(array);
    ObjectInput in = null;
    Event event = null;
    try {
      in = new ObjectInputStream(bis);
      event = (Event) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    } finally {
      try {
        bis.close();
      } catch (IOException ex) {
        // ignore close exception
      }
    }
    return event;
  }

}
