/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xxlabaza.test.tree.height;

import static org.assertj.core.api.Assertions.assertThat;

import com.xxlabaza.test.tree.height.Tree.Node;

import lombok.val;
import org.junit.jupiter.api.Test;

class TreeTests {

  @Test
  void zeroHeightTree () {
    val tree = new Tree();

    assertThat(tree.findHeight())
        .isEqualTo(0);
  }

  @Test
  void onlyRootHeight () {
    val tree = new Tree();
    tree.root = new Node();

    assertThat(tree.findHeight())
        .isEqualTo(1);
  }

  @Test
  void findTreeHeight () {
    val tree = new Tree();
    tree.root = new Node();
    tree.root.left = new Node();
    tree.root.right = new Node();
    tree.root.left.left = new Node();
    tree.root.left.right = new Node();
    tree.root.right.left = new Node();
    tree.root.right.right = new Node();

    assertThat(tree.findHeight())
        .isEqualTo(3);
  }

  @Test
  void oneSideWarpedTreeHeight () {
    val tree = new Tree();
    tree.root = new Node();
    tree.root.left = new Node();
    tree.root.left.left = new Node();
    tree.root.left.left.left = new Node();
    tree.root.left.left.left.left = new Node();

    assertThat(tree.findHeight())
        .isEqualTo(5);
  }
}
