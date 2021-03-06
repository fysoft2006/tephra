/*
 * Copyright © 2016 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package co.cask.tephra.zookeeper;

import org.apache.twill.zookeeper.ACLData;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 * A straightforward implementation of {@link ACLData}.
 */
final class BasicACLData implements ACLData {

  private final List<ACL> acl;
  private final Stat stat;

  BasicACLData(List<ACL> acl, Stat stat) {
    this.acl = acl;
    this.stat = stat;
  }

  @Override
  public List<ACL> getACL() {
    return acl;
  }

  @Override
  public Stat getStat() {
    return stat;
  }
}
