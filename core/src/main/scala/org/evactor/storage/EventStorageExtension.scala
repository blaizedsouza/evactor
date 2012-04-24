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
package org.evactor.storage

import akka.actor.{ ActorSystem, ExtensionId, ExtensionIdProvider, ActorSystemImpl }
import akka.actor.ExtendedActorSystem

object EventStorageExtension extends ExtensionId[EventStorageFactory] with ExtensionIdProvider {
  
  override def get(system: ActorSystem): EventStorageFactory = super.get(system)
  
  override def lookup = EventStorageExtension
  
  override def createExtension(system: ExtendedActorSystem): EventStorageFactory = 
    new EventStorageFactory(system)
  
}
