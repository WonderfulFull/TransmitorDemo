package org.web3j;

import org.web3j.generated.contracts.HelloWorld_sol_HelloWorld;
import org.web3j.generated.contracts.Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

import static org.junit.Assert.fail;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.springframework.security.crypto.codec.Hex;
import org.web3j.abi.TypeEncoder;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.StaticArray;
import org.web3j.abi.datatypes.generated.*;
import org.web3j.crypto.*;

/**
 * <p>
 * This is the generated class for <code>web3j new helloworld</code>
 * </p>
 * <p>
 * It deploys the Hello World contract in src/main/solidity/ and prints its
 * address
 * </p>
 * <p>
 * For more information on how to run this project, please refer to our <a href=
 * "https://docs.web3j.io/latest/command_line_tools/#running-your-application">documentation</a>
 * </p>
 */
public class Web3App {

   public static void main(String[] args) throws Exception {

      // (0) "0xf39Fd6e51aad88F6F4ce6aB8827279cffFb92266" _signers[0]
      // 0xac0974bec39a17e36ba4a6b4d238ff944bacb478cbed5efcae784d7bf4f2ff80
      // (1) "0x70997970C51812dc3A010C7d01b50e0d17dc79C8" _transmitters[0]
      // 0x59c6995e998f97a5a0044966f0945389dc9e86dae88c7a8412f4603b6b78690d
      // (2) "0x3C44CdDdB6a900fa2b585dd299e03d12FA4293BC" _signers[1]
      // 0x5de4111afa1a4b94908f83103eb1f1706367c2e68ca870fc3fb9a804cdab365a
      // (3) "0x90F79bf6EB2c4f870365E785982E1f101E93b906" _transmitters[1]
      // 0x7c852118294e51e653712a81e05800f419141751be58f605c371e15141b007a6
      // (4) "0x15d34AAf54267DB7D7c367839AAf71A00a2C6A65" _signers[2]
      // 0x47e179ec197488593b187f80a00eb0da91f1b9d0b13f8733639f19c30a34926a
      // (5) "0x9965507D1a55bcC2695C58ba16FB37d819B0A4dc" _transmitters[2]
      // 0x8b3a350cf5c34c9194ca85829a2df0ec3153be0318b5e2d3348e872092edffba
      // (6) "0x976EA74026E726554dB657fA54763abd0C3a0aa9"
      // 0x92db14e403b83dfe3df233f83dfa3a0d7096f21ca9b0d6d6b8d88b2b4ec1564e
      // (7) "0x14dC79964da2C08b23698B3D3cc7Ca32193d9955" _transmitters[3]
      // 0x4bbbf85ce3377467afe5d46f804f221813b2bb87f24d81f60f1fcdbf7cbf4356
      // (8) "0x23618e81E3f5cdF7f54C3d65f7FBc0aBf5B21E8f" _signers[3]
      // 0xdbda1821b80551c9d65939329250298aa3472ba22feea921c0cf5d620ea67b97
      // (9) "0xa0Ee7A142d267C1f36714E4a8F75612F20a79720"
      // 0x2a871d0798f97d79848a013d4936a73bf4cc922c825d33c1cf7073dff6d409c6
      List<ECKeyPair> signers = new ArrayList<>(4);
      signers.add(ECKeyPair.create(Hex.decode("ac0974bec39a17e36ba4a6b4d238ff944bacb478cbed5efcae784d7bf4f2ff80")));
      signers.add(ECKeyPair.create(Hex.decode("5de4111afa1a4b94908f83103eb1f1706367c2e68ca870fc3fb9a804cdab365a")));
      signers.add(ECKeyPair.create(Hex.decode("47e179ec197488593b187f80a00eb0da91f1b9d0b13f8733639f19c30a34926a")));
      signers.add(ECKeyPair.create(Hex.decode("dbda1821b80551c9d65939329250298aa3472ba22feea921c0cf5d620ea67b97")));
      ECKeyPair transmiter = ECKeyPair
            .create(Hex.decode("59c6995e998f97a5a0044966f0945389dc9e86dae88c7a8412f4603b6b78690d"));

      var oracleAddr = new Address("0xbee6f7ee5c3358035218d6ea5287b22c9753f1f1");// goerli
      BigInteger decimal = new BigInteger("1000000000000000000");

      // prices
      List<Int192> observations = new ArrayList<>();
      observations.add(new Int192(new BigInteger("1600").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1610").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1605").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1699").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1620").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1630").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1652").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1661").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1625").multiply(decimal)));
      observations.add(new Int192(new BigInteger("1671").multiply(decimal)));
      Web3j web3j = Web3j.build(new HttpService("https://rpc.ankr.com/eth_goerli"));

      Credentials cr = Credentials.create(transmiter);
      var gasProvider = new StaticGasProvider(new BigInteger("1000000000"), new BigInteger("1000000"));
      Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator aggregator = Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator
            .load(
                  oracleAddr.toString(), web3j, cr, gasProvider);

      // get config digest
      var baseEpoch = 130;
      var configDetail = aggregator.latestConfigDetails().send();
      var configDigest = new Bytes16(configDetail.component3());
      System.out.println("config digest:" + configDigest.toString());

      // pack rawReportContext
      var bytes = new byte[32];
      var epoch = new Uint32(baseEpoch).getValue().toByteArray();
      var round = new Uint8(0).getValue().toByteArray();
      // rawReportContext consists of:
      // 11-byte zero padding
      // 16-byte configDigest
      // 4-byte epoch
      // 1-byte round
      System.arraycopy(configDigest.getValue(), 0, bytes, 11, 16);
      System.arraycopy(epoch, 0, bytes, 27 + 4 - epoch.length, epoch.length);
      System.arraycopy(round, 0, bytes, 31, round.length);
      var rawReportContext = new Bytes32(bytes);
      System.out.println("raw context:" + String.valueOf(Hex.encode(rawReportContext.getValue())));

      // pack _report
      StringBuilder msg = new StringBuilder();
      msg.append(TypeEncoder.encode(rawReportContext));
      msg.append(TypeEncoder.encode(new DynamicArray<>(Int192.class, observations)));

      var _report = Hex.decode(msg);
      System.out.println("_report:" + msg);

      // sign report
      List<byte[]> rs = new ArrayList<>();
      List<byte[]> ss = new ArrayList<>();
      byte[] vs = new byte[32];
      var index = 0;
      for (var signer : signers) {
         var Sigdata = Sign.signMessage(_report, signer);
         rs.add(Sigdata.getR());
         ss.add(Sigdata.getS());
         vs[index++] = Sigdata.getV()[0];
      }

      aggregator.transmit(_report, rs, ss, vs).send();
      var latestRound = aggregator.latestRound().send();
      var latestAnswer = aggregator.latestAnswer().send();
      List<BigInteger> answers = new ArrayList<>();
      for (var i = 0; i < 10; i++) {
         var answer = aggregator.getAnswer(new BigInteger(Integer.toString(baseEpoch + i))).send();
         answers.add(answer);
      }
      for (var a : answers) {
         System.out.println(a);
      }
      System.out.println(latestRound);
      System.out.println(latestAnswer);
   }
}
