package org.web3j.generated.contracts;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Array;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicBytes;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes16;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Int192;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint32;
import org.web3j.abi.datatypes.generated.Uint64;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.abi.datatypes.generated.Uint80;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.2.
 */
@SuppressWarnings("rawtypes")
public class Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator extends Contract {
    public static final String BINARY = "Bin file was not provided";

    public static final String FUNC_ACCEPTOWNERSHIP = "acceptOwnership";

    public static final String FUNC_ADDACCESS = "addAccess";

    public static final String FUNC_CHECKENABLED = "checkEnabled";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_DESCRIPTION = "description";

    public static final String FUNC_DISABLEACCESSCHECK = "disableAccessCheck";

    public static final String FUNC_ENABLEACCESSCHECK = "enableAccessCheck";

    public static final String FUNC_GETANSWER = "getAnswer";

    public static final String FUNC_GETROUNDDATA = "getRoundData";

    public static final String FUNC_GETTIMESTAMP = "getTimestamp";

    public static final String FUNC_HASACCESS = "hasAccess";

    public static final String FUNC_LATESTANSWER = "latestAnswer";

    public static final String FUNC_LATESTCONFIGDETAILS = "latestConfigDetails";

    public static final String FUNC_LATESTROUND = "latestRound";

    public static final String FUNC_LATESTROUNDDATA = "latestRoundData";

    public static final String FUNC_LATESTTIMESTAMP = "latestTimestamp";

    public static final String FUNC_LATESTTRANSMISSIONDETAILS = "latestTransmissionDetails";

    public static final String FUNC_OWNER = "owner";

    public static final String FUNC_REMOVEACCESS = "removeAccess";

    public static final String FUNC_SETCONFIG = "setConfig";

    public static final String FUNC_TRANSFEROWNERSHIP = "transferOwnership";

    public static final String FUNC_TRANSMIT = "transmit";

    public static final String FUNC_TRANSMITTERS = "transmitters";

    public static final String FUNC_TYPEANDVERSION = "typeAndVersion";

    public static final String FUNC_VERSION = "version";

    public static final Event ADDEDACCESS_EVENT = new Event("AddedAccess", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    public static final Event ANSWERUPDATED_EVENT = new Event("AnswerUpdated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Int256>(true) {}, new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event CHECKACCESSDISABLED_EVENT = new Event("CheckAccessDisabled", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event CHECKACCESSENABLED_EVENT = new Event("CheckAccessEnabled", 
            Arrays.<TypeReference<?>>asList());
    ;

    public static final Event CONFIGSET_EVENT = new Event("ConfigSet", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}, new TypeReference<Uint64>() {}, new TypeReference<DynamicArray<Address>>() {}, new TypeReference<DynamicArray<Address>>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint64>() {}, new TypeReference<DynamicBytes>() {}));
    ;

    public static final Event NEWROUND_EVENT = new Event("NewRound", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event NEWTRANSMISSION_EVENT = new Event("NewTransmission", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>(true) {}, new TypeReference<Int192>() {}, new TypeReference<Address>() {}, new TypeReference<DynamicArray<Int192>>() {}, new TypeReference<DynamicBytes>() {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event OWNERSHIPTRANSFERREQUESTED_EVENT = new Event("OwnershipTransferRequested", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event OWNERSHIPTRANSFERRED_EVENT = new Event("OwnershipTransferred", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event REMOVEDACCESS_EVENT = new Event("RemovedAccess", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
    ;

    @Deprecated
    protected Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<AddedAccessEventResponse> getAddedAccessEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ADDEDACCESS_EVENT, transactionReceipt);
        ArrayList<AddedAccessEventResponse> responses = new ArrayList<AddedAccessEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AddedAccessEventResponse typedResponse = new AddedAccessEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.user = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AddedAccessEventResponse> addedAccessEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, AddedAccessEventResponse>() {
            @Override
            public AddedAccessEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ADDEDACCESS_EVENT, log);
                AddedAccessEventResponse typedResponse = new AddedAccessEventResponse();
                typedResponse.log = log;
                typedResponse.user = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AddedAccessEventResponse> addedAccessEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ADDEDACCESS_EVENT));
        return addedAccessEventFlowable(filter);
    }

    public static List<AnswerUpdatedEventResponse> getAnswerUpdatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ANSWERUPDATED_EVENT, transactionReceipt);
        ArrayList<AnswerUpdatedEventResponse> responses = new ArrayList<AnswerUpdatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AnswerUpdatedEventResponse typedResponse = new AnswerUpdatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.current = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.roundId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.updatedAt = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AnswerUpdatedEventResponse> answerUpdatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, AnswerUpdatedEventResponse>() {
            @Override
            public AnswerUpdatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ANSWERUPDATED_EVENT, log);
                AnswerUpdatedEventResponse typedResponse = new AnswerUpdatedEventResponse();
                typedResponse.log = log;
                typedResponse.current = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.roundId = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.updatedAt = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AnswerUpdatedEventResponse> answerUpdatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ANSWERUPDATED_EVENT));
        return answerUpdatedEventFlowable(filter);
    }

    public static List<CheckAccessDisabledEventResponse> getCheckAccessDisabledEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CHECKACCESSDISABLED_EVENT, transactionReceipt);
        ArrayList<CheckAccessDisabledEventResponse> responses = new ArrayList<CheckAccessDisabledEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CheckAccessDisabledEventResponse typedResponse = new CheckAccessDisabledEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CheckAccessDisabledEventResponse> checkAccessDisabledEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CheckAccessDisabledEventResponse>() {
            @Override
            public CheckAccessDisabledEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CHECKACCESSDISABLED_EVENT, log);
                CheckAccessDisabledEventResponse typedResponse = new CheckAccessDisabledEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Flowable<CheckAccessDisabledEventResponse> checkAccessDisabledEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CHECKACCESSDISABLED_EVENT));
        return checkAccessDisabledEventFlowable(filter);
    }

    public static List<CheckAccessEnabledEventResponse> getCheckAccessEnabledEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CHECKACCESSENABLED_EVENT, transactionReceipt);
        ArrayList<CheckAccessEnabledEventResponse> responses = new ArrayList<CheckAccessEnabledEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CheckAccessEnabledEventResponse typedResponse = new CheckAccessEnabledEventResponse();
            typedResponse.log = eventValues.getLog();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CheckAccessEnabledEventResponse> checkAccessEnabledEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CheckAccessEnabledEventResponse>() {
            @Override
            public CheckAccessEnabledEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CHECKACCESSENABLED_EVENT, log);
                CheckAccessEnabledEventResponse typedResponse = new CheckAccessEnabledEventResponse();
                typedResponse.log = log;
                return typedResponse;
            }
        });
    }

    public Flowable<CheckAccessEnabledEventResponse> checkAccessEnabledEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CHECKACCESSENABLED_EVENT));
        return checkAccessEnabledEventFlowable(filter);
    }

    public static List<ConfigSetEventResponse> getConfigSetEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(CONFIGSET_EVENT, transactionReceipt);
        ArrayList<ConfigSetEventResponse> responses = new ArrayList<ConfigSetEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            ConfigSetEventResponse typedResponse = new ConfigSetEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.previousConfigBlockNumber = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.configCount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.signers = (List<String>) ((Array) eventValues.getNonIndexedValues().get(2)).getNativeValueCopy();
            typedResponse.transmitters = (List<String>) ((Array) eventValues.getNonIndexedValues().get(3)).getNativeValueCopy();
            typedResponse.threshold = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
            typedResponse.encodedConfigVersion = (BigInteger) eventValues.getNonIndexedValues().get(5).getValue();
            typedResponse.encoded = (byte[]) eventValues.getNonIndexedValues().get(6).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<ConfigSetEventResponse> configSetEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, ConfigSetEventResponse>() {
            @Override
            public ConfigSetEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CONFIGSET_EVENT, log);
                ConfigSetEventResponse typedResponse = new ConfigSetEventResponse();
                typedResponse.log = log;
                typedResponse.previousConfigBlockNumber = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.configCount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.signers = (List<String>) ((Array) eventValues.getNonIndexedValues().get(2)).getNativeValueCopy();
                typedResponse.transmitters = (List<String>) ((Array) eventValues.getNonIndexedValues().get(3)).getNativeValueCopy();
                typedResponse.threshold = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
                typedResponse.encodedConfigVersion = (BigInteger) eventValues.getNonIndexedValues().get(5).getValue();
                typedResponse.encoded = (byte[]) eventValues.getNonIndexedValues().get(6).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<ConfigSetEventResponse> configSetEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CONFIGSET_EVENT));
        return configSetEventFlowable(filter);
    }

    public static List<NewRoundEventResponse> getNewRoundEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(NEWROUND_EVENT, transactionReceipt);
        ArrayList<NewRoundEventResponse> responses = new ArrayList<NewRoundEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewRoundEventResponse typedResponse = new NewRoundEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.roundId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.startedBy = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.startedAt = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<NewRoundEventResponse> newRoundEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, NewRoundEventResponse>() {
            @Override
            public NewRoundEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(NEWROUND_EVENT, log);
                NewRoundEventResponse typedResponse = new NewRoundEventResponse();
                typedResponse.log = log;
                typedResponse.roundId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.startedBy = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.startedAt = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<NewRoundEventResponse> newRoundEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(NEWROUND_EVENT));
        return newRoundEventFlowable(filter);
    }

    public static List<NewTransmissionEventResponse> getNewTransmissionEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(NEWTRANSMISSION_EVENT, transactionReceipt);
        ArrayList<NewTransmissionEventResponse> responses = new ArrayList<NewTransmissionEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            NewTransmissionEventResponse typedResponse = new NewTransmissionEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.aggregatorRoundId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.answer = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.transmitter = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.observations = (List<BigInteger>) ((Array) eventValues.getNonIndexedValues().get(2)).getNativeValueCopy();
            typedResponse.observers = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse.rawReportContext = (byte[]) eventValues.getNonIndexedValues().get(4).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<NewTransmissionEventResponse> newTransmissionEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, NewTransmissionEventResponse>() {
            @Override
            public NewTransmissionEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(NEWTRANSMISSION_EVENT, log);
                NewTransmissionEventResponse typedResponse = new NewTransmissionEventResponse();
                typedResponse.log = log;
                typedResponse.aggregatorRoundId = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.answer = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.transmitter = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.observations = (List<BigInteger>) ((Array) eventValues.getNonIndexedValues().get(2)).getNativeValueCopy();
                typedResponse.observers = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse.rawReportContext = (byte[]) eventValues.getNonIndexedValues().get(4).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<NewTransmissionEventResponse> newTransmissionEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(NEWTRANSMISSION_EVENT));
        return newTransmissionEventFlowable(filter);
    }

    public static List<OwnershipTransferRequestedEventResponse> getOwnershipTransferRequestedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(OWNERSHIPTRANSFERREQUESTED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferRequestedEventResponse> responses = new ArrayList<OwnershipTransferRequestedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferRequestedEventResponse typedResponse = new OwnershipTransferRequestedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<OwnershipTransferRequestedEventResponse> ownershipTransferRequestedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, OwnershipTransferRequestedEventResponse>() {
            @Override
            public OwnershipTransferRequestedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERREQUESTED_EVENT, log);
                OwnershipTransferRequestedEventResponse typedResponse = new OwnershipTransferRequestedEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<OwnershipTransferRequestedEventResponse> ownershipTransferRequestedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERREQUESTED_EVENT));
        return ownershipTransferRequestedEventFlowable(filter);
    }

    public static List<OwnershipTransferredEventResponse> getOwnershipTransferredEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, transactionReceipt);
        ArrayList<OwnershipTransferredEventResponse> responses = new ArrayList<OwnershipTransferredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, OwnershipTransferredEventResponse>() {
            @Override
            public OwnershipTransferredEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(OWNERSHIPTRANSFERRED_EVENT, log);
                OwnershipTransferredEventResponse typedResponse = new OwnershipTransferredEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<OwnershipTransferredEventResponse> ownershipTransferredEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(OWNERSHIPTRANSFERRED_EVENT));
        return ownershipTransferredEventFlowable(filter);
    }

    public static List<RemovedAccessEventResponse> getRemovedAccessEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(REMOVEDACCESS_EVENT, transactionReceipt);
        ArrayList<RemovedAccessEventResponse> responses = new ArrayList<RemovedAccessEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            RemovedAccessEventResponse typedResponse = new RemovedAccessEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.user = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<RemovedAccessEventResponse> removedAccessEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, RemovedAccessEventResponse>() {
            @Override
            public RemovedAccessEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(REMOVEDACCESS_EVENT, log);
                RemovedAccessEventResponse typedResponse = new RemovedAccessEventResponse();
                typedResponse.log = log;
                typedResponse.user = (String) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<RemovedAccessEventResponse> removedAccessEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(REMOVEDACCESS_EVENT));
        return removedAccessEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> acceptOwnership() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ACCEPTOWNERSHIP, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> addAccess(String _user) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ADDACCESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _user)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> checkEnabled() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_CHECKENABLED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> decimals() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_DECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> description() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_DESCRIPTION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> disableAccessCheck() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_DISABLEACCESSCHECK, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> enableAccessCheck() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_ENABLEACCESSCHECK, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> getAnswer(BigInteger _roundId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETANSWER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roundId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>> getRoundData(BigInteger _roundId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETROUNDDATA, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint80(_roundId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint80>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint80>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> getTimestamp(BigInteger _roundId) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GETTIMESTAMP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roundId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Boolean> hasAccess(String _user, byte[] _calldata) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_HASACCESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _user), 
                new org.web3j.abi.datatypes.DynamicBytes(_calldata)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<BigInteger> latestAnswer() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LATESTANSWER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Int256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple3<BigInteger, BigInteger, byte[]>> latestConfigDetails() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LATESTCONFIGDETAILS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint32>() {}, new TypeReference<Uint32>() {}, new TypeReference<Bytes16>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, BigInteger, byte[]>>(function,
                new Callable<Tuple3<BigInteger, BigInteger, byte[]>>() {
                    @Override
                    public Tuple3<BigInteger, BigInteger, byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, BigInteger, byte[]>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (byte[]) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> latestRound() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LATESTROUND, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>> latestRoundData() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LATESTROUNDDATA, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint80>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint80>() {}));
        return new RemoteFunctionCall<Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<BigInteger, BigInteger, BigInteger, BigInteger, BigInteger>(
                                (BigInteger) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> latestTimestamp() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LATESTTIMESTAMP, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple5<byte[], BigInteger, BigInteger, BigInteger, BigInteger>> latestTransmissionDetails() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_LATESTTRANSMISSIONDETAILS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes16>() {}, new TypeReference<Uint32>() {}, new TypeReference<Uint8>() {}, new TypeReference<Int192>() {}, new TypeReference<Uint64>() {}));
        return new RemoteFunctionCall<Tuple5<byte[], BigInteger, BigInteger, BigInteger, BigInteger>>(function,
                new Callable<Tuple5<byte[], BigInteger, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple5<byte[], BigInteger, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<byte[], BigInteger, BigInteger, BigInteger, BigInteger>(
                                (byte[]) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue(), 
                                (BigInteger) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> owner() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_OWNER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> removeAccess(String _user) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_REMOVEACCESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _user)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setConfig(List<String> _signers, List<String> _transmitters, BigInteger _threshold, BigInteger _encodedConfigVersion, byte[] _encoded) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SETCONFIG, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_signers, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(_transmitters, org.web3j.abi.datatypes.Address.class)), 
                new org.web3j.abi.datatypes.generated.Uint8(_threshold), 
                new org.web3j.abi.datatypes.generated.Uint64(_encodedConfigVersion), 
                new org.web3j.abi.datatypes.DynamicBytes(_encoded)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> transferOwnership(String _to) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_TRANSFEROWNERSHIP, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _to)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> transmit(byte[] _report, List<byte[]> _rs, List<byte[]> _ss, byte[] _rawVs) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_TRANSMIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicBytes(_report), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(_rs, org.web3j.abi.datatypes.generated.Bytes32.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.datatypes.generated.Bytes32.class,
                        org.web3j.abi.Utils.typeMap(_ss, org.web3j.abi.datatypes.generated.Bytes32.class)), 
                new org.web3j.abi.datatypes.generated.Bytes32(_rawVs)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<List> transmitters() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TRANSMITTERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<String> typeAndVersion() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TYPEANDVERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> version() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_VERSION, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Src_BinaxOffchainAggregator_sol_BinaxOffchainAggregator(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class AddedAccessEventResponse extends BaseEventResponse {
        public String user;
    }

    public static class AnswerUpdatedEventResponse extends BaseEventResponse {
        public BigInteger current;

        public BigInteger roundId;

        public BigInteger updatedAt;
    }

    public static class CheckAccessDisabledEventResponse extends BaseEventResponse {
    }

    public static class CheckAccessEnabledEventResponse extends BaseEventResponse {
    }

    public static class ConfigSetEventResponse extends BaseEventResponse {
        public BigInteger previousConfigBlockNumber;

        public BigInteger configCount;

        public List<String> signers;

        public List<String> transmitters;

        public BigInteger threshold;

        public BigInteger encodedConfigVersion;

        public byte[] encoded;
    }

    public static class NewRoundEventResponse extends BaseEventResponse {
        public BigInteger roundId;

        public String startedBy;

        public BigInteger startedAt;
    }

    public static class NewTransmissionEventResponse extends BaseEventResponse {
        public BigInteger aggregatorRoundId;

        public BigInteger answer;

        public String transmitter;

        public List<BigInteger> observations;

        public byte[] observers;

        public byte[] rawReportContext;
    }

    public static class OwnershipTransferRequestedEventResponse extends BaseEventResponse {
        public String from;

        public String to;
    }

    public static class OwnershipTransferredEventResponse extends BaseEventResponse {
        public String from;

        public String to;
    }

    public static class RemovedAccessEventResponse extends BaseEventResponse {
        public String user;
    }
}
