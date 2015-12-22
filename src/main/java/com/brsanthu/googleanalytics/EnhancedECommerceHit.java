/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.brsanthu.googleanalytics;

import static com.brsanthu.googleanalytics.GoogleAnalyticsParameter.*;

/**
 * GA request to track events.
 *
 * <p>For more information, see <a href="https://developers.google.com/analytics/devguides/collection/protocol/v1/parameters#events">GA Parameters Reference</a></p>
 *
 * @author Santhosh Kumar
 */
public class EnhancedECommerceHit extends GoogleAnalyticsRequest<EnhancedECommerceHit> {


	public EnhancedECommerceHit(EnhancedEcommerceHitType eht) {
    super("ec:"+eht);
  }


}
