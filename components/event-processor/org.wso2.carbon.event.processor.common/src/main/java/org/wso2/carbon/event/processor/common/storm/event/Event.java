/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.carbon.event.processor.common.storm.event;

/**
 * Extended Event class to hold additional Stream ID info needed in
 * Storm EventReceiverSpout
 */
public class Event extends org.wso2.siddhi.core.event.Event {

    private String streamId;

    public Event (long timestamp, Object[] data, String streamId){
        super.setTimestamp(timestamp);
        super.setData(data);
        this.streamId = streamId;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }


}
