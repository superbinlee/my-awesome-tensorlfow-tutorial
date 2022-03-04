// Targeted by JavaCPP version 1.5.6: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;

// Parsed from tensorflow/c/c_api_internal.h

@NoOffset @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TF_Graph extends org.tensorflow.internal.c_api.AbstractTF_Graph {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Graph(Pointer p) { super(p); }


  
  public native @MemberGetter @ByRef NativeGraphPointer graph();

  // Runs shape inference.
  

  // Maps from name of an operation to the Node* in 'graph'.
  public native @ByRef NameMap name_map(); public native TF_Graph name_map(NameMap setter);

  // The keys of this map are all the active sessions using this graph. Each
  // value records whether the graph has been mutated since the corresponding
  // session has been run (this is detected in RecordMutation function). If the
  // string is empty, no mutation has occurred. Otherwise the string is a
  // description of the mutation suitable for returning to the user.
  //
  // Sessions are added to this map in TF_NewSession, and removed in
  // TF_DeleteSession.
  // TF_Graph may only / must be deleted when
  //   sessions.size() == 0 && delete_requested == true
  //
  // TODO(b/74949947): mutations currently trigger a warning instead of a bad
  // status, this should be reverted when possible.
  
    // set true by TF_DeleteGraph

  // Used to link graphs contained in TF_WhileParams to the parent graph that
  // will eventually contain the full while loop.
  public native TF_Graph parent(); public native TF_Graph parent(TF_Graph setter);
  public native TF_Output parent_inputs(); public native TF_Graph parent_inputs(TF_Output setter);
}