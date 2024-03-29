/*
 * Copyright © 1996-2008 GlobalMentor, Inc. <https://www.globalmentor.com/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.globalmentor.mail;

import com.globalmentor.text.StringTemplate;

/**
 * Constant values for mail.
 * @author Garret Wilson
 */
public class Mail {

	/** The property that contains whether mail debug is turned on. */
	public static final String MAIL_DEBUG_PROPERTY = "mail.debug";
	/** The property that contains the mail from address. */
	public static final String MAIL_FROM_PROPERTY = "mail.from";
	/** The property that contains the mail host name. */
	public static final String MAIL_HOST_PROPERTY = "mail.host";
	/** The template for "mail-<var>protocol</var>.auth". */
	public static final StringTemplate MAIL_PROTOCOL_AUTH_PROPERTY_TEMPLATE = StringTemplate.of("mail.", StringTemplate.STRING_PARAMETER, ".auth");
	/** The template for "mail-<var>protocol</var>.host". */
	public static final StringTemplate MAIL_PROTOCOL_HOST_PROPERTY_TEMPLATE = StringTemplate.of("mail.", StringTemplate.STRING_PARAMETER, ".host");
	/** The template for "mail-<var>protocol</var>.password". */
	public static final StringTemplate MAIL_PROTOCOL_PASSWORD_PROPERTY_TEMPLATE = StringTemplate.of("mail.", StringTemplate.STRING_PARAMETER, ".password");
	/** The template for "mail-<var>protocol</var>.port". */
	public static final StringTemplate MAIL_PROTOCOL_PORT_PROPERTY_TEMPLATE = StringTemplate.of("mail.", StringTemplate.STRING_PARAMETER, ".port");
	/** The template for "mail-<var>protocol</var>.user". */
	public static final StringTemplate MAIL_PROTOCOL_USER_PROPERTY_TEMPLATE = StringTemplate.of("mail.", StringTemplate.STRING_PARAMETER, ".user");
	/** The property that specifies the protocol for mail transport. */
	public static final String MAIL_TRANSPORT_PROTOCOL_PROPERTY = "mail.transport.protocol";

}