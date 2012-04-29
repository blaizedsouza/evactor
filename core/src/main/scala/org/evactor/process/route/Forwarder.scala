/*
 * Copyright 2012 Albert Örwall
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.evactor.process.route

import org.evactor.model.events.Event
import org.evactor.process.Processor
import org.evactor.process.Publication
import org.evactor.process.Subscription
import org.evactor.process.Publisher

/**
 * Forwards events to another channel and category
 */
class Forwarder (
    override val subscriptions: List[Subscription],
    val publication: Publication)
  extends Processor(subscriptions) with Publisher {

  override type T = Event
  
  def process(event: T) {
    publish(event)
  }

}