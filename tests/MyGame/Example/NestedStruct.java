// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class NestedStruct extends Struct {
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public NestedStruct __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int a(int j) { return bb.getInt(bb_pos + 0 + j * 4); }
  public void mutateA(int j, int a) { bb.putInt(bb_pos + 0 + j * 4, a); }
  public byte b() { return bb.get(bb_pos + 8); }
  public void mutateB(byte b) { bb.put(bb_pos + 8, b); }
  public byte c(int j) { return bb.get(bb_pos + 9 + j * 1); }
  public void mutateC(int j, byte c) { bb.put(bb_pos + 9 + j * 1, c); }
  public long d(int j) { return bb.getLong(bb_pos + 16 + j * 8); }
  public void mutateD(int j, long d) { bb.putLong(bb_pos + 16 + j * 8, d); }

  public static int createNestedStruct(FlatBufferBuilder builder, int[] a, byte b, byte[] c, long[] d) {
    builder.prep(8, 32);
    for (int _idx0 = 2; _idx0 > 0; _idx0--) {
      builder.putLong(d[_idx0-1]);
    }
    builder.pad(5);
    for (int _idx0 = 2; _idx0 > 0; _idx0--) {
      builder.putByte(c[_idx0-1]);
    }
    builder.putByte(b);
    for (int _idx0 = 2; _idx0 > 0; _idx0--) {
      builder.putInt(a[_idx0-1]);
    }
    return builder.offset();
  }
}

