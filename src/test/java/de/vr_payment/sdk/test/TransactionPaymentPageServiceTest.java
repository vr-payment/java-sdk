package de.vr_payment.sdk.test;

import static de.vr_payment.sdk.test.TestUtils.getApiClient;
import static org.junit.Assert.assertTrue;

import de.vr_payment.sdk.ApiClient;
import de.vr_payment.sdk.model.*;
import de.vr_payment.sdk.service.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class TransactionPaymentPageServiceTest {
  private TransactionService transactionService;
  private TransactionPaymentPageService transactionPaymentPageService;

  @Before
  public void beforeEach() {
    ApiClient apiClient = getApiClient();

    transactionService = apiClient.getTransactionService();
    transactionPaymentPageService = apiClient.getTransactionPaymentPageService();
  }

  @Test
  public void shouldCreateUrlForJavascriptUsage() throws IOException {
    Transaction transaction = transactionService.create(TestConstants.SPACE_ID,
        TestUtils.getTransactionCreatePayload());

    String url =
        transactionPaymentPageService.paymentPageUrl(TestConstants.SPACE_ID, transaction.getId());

    assertTrue("URL must have proper format", url.contains("securityToken"));
  }
}
