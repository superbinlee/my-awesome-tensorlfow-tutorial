/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.io;

import java.util.Arrays;
import java.util.List;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.framework.DataType;
import org.tensorflow.types.family.TType;

/**
 * A queue that produces elements sorted by the first component value.
 * Note that the PriorityQueue requires the first component of any element
 * to be a scalar int64, in addition to the other elements declared by
 * component_types.  Therefore calls to Enqueue and EnqueueMany (resp. Dequeue
 * and DequeueMany) on a PriorityQueue will all require (resp. output) one extra
 * entry in their input (resp. output) lists.
 */
@OpMetadata(
    opType = PriorityQueue.OP_NAME,
    inputsClass = PriorityQueue.Inputs.class
)
@Operator(
    group = "io"
)
public final class PriorityQueue extends RawOp implements Operand<TType> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "PriorityQueueV2";

  private Output<? extends TType> handle;

  @SuppressWarnings("unchecked")
  public PriorityQueue(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new PriorityQueueV2 operation.
   *
   * @param scope current scope
   * @param componentTypes The type of each component in a value.
   * @param shapes The shape of each component in a value. The length of this attr must
   * be either 0 or the same as the length of component_types. If the length of
   * this attr is 0, the shapes of queue elements are not constrained, and
   * only one element may be dequeued at a time.
   * @param options carries optional attribute values
   * @return a new instance of PriorityQueue
   */
  @Endpoint(
      describeByClass = true
  )
  public static PriorityQueue create(Scope scope, List<Class<? extends TType>> componentTypes,
      List<Shape> shapes, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "PriorityQueue");
    opBuilder.setAttr("component_types", Operands.toDataTypes(componentTypes));
    Shape[] shapesArray = new Shape[shapes.size()];
    for (int i = 0 ; i < shapesArray.length ; i++) {
      shapesArray[i] = shapes.get(i);
    }
    opBuilder.setAttr("shapes", shapesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.capacity != null) {
          opBuilder.setAttr("capacity", opts.capacity);
        }
        if (opts.container != null) {
          opBuilder.setAttr("container", opts.container);
        }
        if (opts.sharedName != null) {
          opBuilder.setAttr("shared_name", opts.sharedName);
        }
      }
    }
    return new PriorityQueue(opBuilder.build());
  }

  /**
   * Sets the capacity option.
   *
   * @param capacity The upper bound on the number of elements in this queue.
   * Negative numbers mean no limit.
   * @return this Options instance.
   */
  public static Options capacity(Long capacity) {
    return new Options().capacity(capacity);
  }

  /**
   * Sets the container option.
   *
   * @param container If non-empty, this queue is placed in the given container.
   * Otherwise, a default container is used.
   * @return this Options instance.
   */
  public static Options container(String container) {
    return new Options().container(container);
  }

  /**
   * Sets the sharedName option.
   *
   * @param sharedName If non-empty, this queue will be shared under the given name
   * across multiple sessions.
   * @return this Options instance.
   */
  public static Options sharedName(String sharedName) {
    return new Options().sharedName(sharedName);
  }

  /**
   * Gets handle.
   * The handle to the queue.
   * @return handle.
   */
  public Output<? extends TType> handle() {
    return handle;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.io.PriorityQueue}
   */
  public static class Options {
    private Long capacity;

    private String container;

    private String sharedName;

    private Options() {
    }

    /**
     * Sets the capacity option.
     *
     * @param capacity The upper bound on the number of elements in this queue.
     * Negative numbers mean no limit.
     * @return this Options instance.
     */
    public Options capacity(Long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Sets the container option.
     *
     * @param container If non-empty, this queue is placed in the given container.
     * Otherwise, a default container is used.
     * @return this Options instance.
     */
    public Options container(String container) {
      this.container = container;
      return this;
    }

    /**
     * Sets the sharedName option.
     *
     * @param sharedName If non-empty, this queue will be shared under the given name
     * across multiple sessions.
     * @return this Options instance.
     */
    public Options sharedName(String sharedName) {
      this.sharedName = sharedName;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = PriorityQueue.class
  )
  public static class Inputs extends RawOpInputs<PriorityQueue> {
    /**
     * The type of each component in a value.
     */
    public final DataType[] componentTypes;

    /**
     * The shape of each component in a value. The length of this attr must
     * be either 0 or the same as the length of component_types. If the length of
     * this attr is 0, the shapes of queue elements are not constrained, and
     * only one element may be dequeued at a time.
     */
    public final Shape[] shapes;

    /**
     * The upper bound on the number of elements in this queue.
     * Negative numbers mean no limit.
     */
    public final long capacity;

    /**
     * If non-empty, this queue is placed in the given container.
     * Otherwise, a default container is used.
     */
    public final String container;

    /**
     * If non-empty, this queue will be shared under the given name
     * across multiple sessions.
     */
    public final String sharedName;

    public Inputs(GraphOperation op) {
      super(new PriorityQueue(op), op, Arrays.asList("component_types", "shapes", "capacity", "container", "shared_name"));
      int inputIndex = 0;
      componentTypes = op.attributes().getAttrTypeList("component_types");
      shapes = op.attributes().getAttrShapeList("shapes");
      capacity = op.attributes().getAttrInt("capacity");
      container = op.attributes().getAttrString("container");
      sharedName = op.attributes().getAttrString("shared_name");
    }
  }
}