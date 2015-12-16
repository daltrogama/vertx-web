/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.serviceproxy.testmodel;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
/**
 * Test base imports are corrects.
*/
@CompileStatic
public class TestBaseImportsService {
  private final def io.vertx.serviceproxy.testmodel.TestBaseImportsService delegate;
  public TestBaseImportsService(Object delegate) {
    this.delegate = (io.vertx.serviceproxy.testmodel.TestBaseImportsService) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public void m() {
    this.delegate.m();
  }
}
