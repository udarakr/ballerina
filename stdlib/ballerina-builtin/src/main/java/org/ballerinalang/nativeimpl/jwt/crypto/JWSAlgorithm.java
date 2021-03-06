/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.nativeimpl.jwt.crypto;

/**
 * JSON Web Signature (JWS) algorithm name, represents the {@code alg} header
 * parameter in JWS objects.
 *
 * @since 0.964.0
 */
public final class JWSAlgorithm {

    /**
     * RSASSA-PKCS-v1_5 using SHA-256 hash algorithm.
     */
    public static final String RS256 = "RS256";

    /**
     * RSASSA-PKCS-v1_5 using SHA-384 hash algorithm.
     */
    public static final String RS384 = "RS384";

    /**
     * RSASSA-PKCS-v1_5 using SHA-512 hash algorithm (optional).
     */
    public static final String RS512 = "RS512";

}
