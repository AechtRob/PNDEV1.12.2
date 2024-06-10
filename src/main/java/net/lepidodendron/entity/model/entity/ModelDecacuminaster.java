package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDecacuminaster extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer core;
    private final AdvancedModelRenderer armmiddlebase;
    private final AdvancedModelRenderer armbase;
    private final AdvancedModelRenderer arma;
    private final AdvancedModelRenderer armb;
    private final AdvancedModelRenderer armc;
    private final AdvancedModelRenderer armmiddlebase10;
    private final AdvancedModelRenderer armbase10;
    private final AdvancedModelRenderer arma10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer armc10;
    private final AdvancedModelRenderer armmiddlebase3;
    private final AdvancedModelRenderer armbase3;
    private final AdvancedModelRenderer arma3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer armc3;
    private final AdvancedModelRenderer armmiddlebase17;
    private final AdvancedModelRenderer armbase17;
    private final AdvancedModelRenderer arma17;
    private final AdvancedModelRenderer armb17;
    private final AdvancedModelRenderer armc17;
    private final AdvancedModelRenderer armmiddlebase5;
    private final AdvancedModelRenderer armbase5;
    private final AdvancedModelRenderer arma5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer armc5;
    private final AdvancedModelRenderer armmiddlebase15;
    private final AdvancedModelRenderer armbase15;
    private final AdvancedModelRenderer arma15;
    private final AdvancedModelRenderer armb15;
    private final AdvancedModelRenderer armc15;
    private final AdvancedModelRenderer armmiddlebase7;
    private final AdvancedModelRenderer armbase7;
    private final AdvancedModelRenderer arma7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer armc7;
    private final AdvancedModelRenderer armmiddlebase13;
    private final AdvancedModelRenderer armbase13;
    private final AdvancedModelRenderer arma13;
    private final AdvancedModelRenderer armb13;
    private final AdvancedModelRenderer armc13;
    private final AdvancedModelRenderer armmiddlebase9;
    private final AdvancedModelRenderer armbase9;
    private final AdvancedModelRenderer arma9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer armc9;
    private final AdvancedModelRenderer armmiddlebase11;
    private final AdvancedModelRenderer armbase11;
    private final AdvancedModelRenderer arma11;
    private final AdvancedModelRenderer armb11;
    private final AdvancedModelRenderer armc11;
    private final AdvancedModelRenderer armmiddlebase2;
    private final AdvancedModelRenderer armbase2;
    private final AdvancedModelRenderer arma2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer armc2;
    private final AdvancedModelRenderer armmiddlebase18;
    private final AdvancedModelRenderer armbase18;
    private final AdvancedModelRenderer arma18;
    private final AdvancedModelRenderer armb18;
    private final AdvancedModelRenderer armc18;
    private final AdvancedModelRenderer armmiddlebase8;
    private final AdvancedModelRenderer armbase8;
    private final AdvancedModelRenderer arma8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer armc8;
    private final AdvancedModelRenderer armmiddlebase12;
    private final AdvancedModelRenderer armbase12;
    private final AdvancedModelRenderer arma12;
    private final AdvancedModelRenderer armb12;
    private final AdvancedModelRenderer armc12;
    private final AdvancedModelRenderer armmiddlebase4;
    private final AdvancedModelRenderer armbase4;
    private final AdvancedModelRenderer arma4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer armc4;
    private final AdvancedModelRenderer armmiddlebase16;
    private final AdvancedModelRenderer armbase16;
    private final AdvancedModelRenderer arma16;
    private final AdvancedModelRenderer armb16;
    private final AdvancedModelRenderer armc16;
    private final AdvancedModelRenderer armmiddlebase6;
    private final AdvancedModelRenderer armbase6;
    private final AdvancedModelRenderer arma6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer armc6;
    private final AdvancedModelRenderer armmiddlebase14;
    private final AdvancedModelRenderer armbase14;
    private final AdvancedModelRenderer arma14;
    private final AdvancedModelRenderer armb14;
    private final AdvancedModelRenderer armc14;

    public ModelDecacuminaster() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.core = new AdvancedModelRenderer(this);
        this.core.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.root.addChild(core);
        this.core.cubeList.add(new ModelBox(core, 0, 0, -4.0F, -1.95F, -5.0F, 8, 2, 8, 0.0F, false));

        this.armmiddlebase = new AdvancedModelRenderer(this);
        this.armmiddlebase.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase);


        this.armbase = new AdvancedModelRenderer(this);
        this.armbase.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase.addChild(armbase);
        this.armbase.cubeList.add(new ModelBox(armbase, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma = new AdvancedModelRenderer(this);
        this.arma.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase.addChild(arma);
        this.arma.cubeList.add(new ModelBox(arma, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb = new AdvancedModelRenderer(this);
        this.armb.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma.addChild(armb);
        this.armb.cubeList.add(new ModelBox(armb, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc = new AdvancedModelRenderer(this);
        this.armc.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb.addChild(armc);
        this.armc.cubeList.add(new ModelBox(armc, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase10 = new AdvancedModelRenderer(this);
        this.armmiddlebase10.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase10);


        this.armbase10 = new AdvancedModelRenderer(this);
        this.armbase10.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.armmiddlebase10.addChild(armbase10);
        this.armbase10.cubeList.add(new ModelBox(armbase10, 7, 17, -1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.arma10 = new AdvancedModelRenderer(this);
        this.arma10.setRotationPoint(0.0F, -0.5F, 2.0F);
        this.armbase10.addChild(arma10);
        this.arma10.cubeList.add(new ModelBox(arma10, 0, 10, -1.0F, -0.51F, 0.0F, 2, 1, 5, 0.0F, false));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.arma10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 9, 11, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));

        this.armc10 = new AdvancedModelRenderer(this);
        this.armc10.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.armb10.addChild(armc10);
        this.armc10.cubeList.add(new ModelBox(armc10, 0, 16, -0.5F, -0.51F, 0.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase3 = new AdvancedModelRenderer(this);
        this.armmiddlebase3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase3);
        this.setRotateAngle(armmiddlebase3, 0.0F, -0.6981F, 0.0F);


        this.armbase3 = new AdvancedModelRenderer(this);
        this.armbase3.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase3.addChild(armbase3);
        this.armbase3.cubeList.add(new ModelBox(armbase3, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma3 = new AdvancedModelRenderer(this);
        this.arma3.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase3.addChild(arma3);
        this.arma3.cubeList.add(new ModelBox(arma3, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc3 = new AdvancedModelRenderer(this);
        this.armc3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb3.addChild(armc3);
        this.armc3.cubeList.add(new ModelBox(armc3, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase17 = new AdvancedModelRenderer(this);
        this.armmiddlebase17.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase17);
        this.setRotateAngle(armmiddlebase17, 0.0F, 0.6981F, 0.0F);


        this.armbase17 = new AdvancedModelRenderer(this);
        this.armbase17.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase17.addChild(armbase17);
        this.armbase17.cubeList.add(new ModelBox(armbase17, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma17 = new AdvancedModelRenderer(this);
        this.arma17.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase17.addChild(arma17);
        this.arma17.cubeList.add(new ModelBox(arma17, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb17 = new AdvancedModelRenderer(this);
        this.armb17.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma17.addChild(armb17);
        this.armb17.cubeList.add(new ModelBox(armb17, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc17 = new AdvancedModelRenderer(this);
        this.armc17.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb17.addChild(armc17);
        this.armc17.cubeList.add(new ModelBox(armc17, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase5 = new AdvancedModelRenderer(this);
        this.armmiddlebase5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase5);
        this.setRotateAngle(armmiddlebase5, 0.0F, -1.3963F, 0.0F);


        this.armbase5 = new AdvancedModelRenderer(this);
        this.armbase5.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase5.addChild(armbase5);
        this.armbase5.cubeList.add(new ModelBox(armbase5, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma5 = new AdvancedModelRenderer(this);
        this.arma5.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase5.addChild(arma5);
        this.arma5.cubeList.add(new ModelBox(arma5, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc5 = new AdvancedModelRenderer(this);
        this.armc5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb5.addChild(armc5);
        this.armc5.cubeList.add(new ModelBox(armc5, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase15 = new AdvancedModelRenderer(this);
        this.armmiddlebase15.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase15);
        this.setRotateAngle(armmiddlebase15, 0.0F, 1.3963F, 0.0F);


        this.armbase15 = new AdvancedModelRenderer(this);
        this.armbase15.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase15.addChild(armbase15);
        this.armbase15.cubeList.add(new ModelBox(armbase15, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma15 = new AdvancedModelRenderer(this);
        this.arma15.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase15.addChild(arma15);
        this.arma15.cubeList.add(new ModelBox(arma15, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb15 = new AdvancedModelRenderer(this);
        this.armb15.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma15.addChild(armb15);
        this.armb15.cubeList.add(new ModelBox(armb15, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc15 = new AdvancedModelRenderer(this);
        this.armc15.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb15.addChild(armc15);
        this.armc15.cubeList.add(new ModelBox(armc15, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase7 = new AdvancedModelRenderer(this);
        this.armmiddlebase7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase7);
        this.setRotateAngle(armmiddlebase7, 0.0F, -2.0944F, 0.0F);


        this.armbase7 = new AdvancedModelRenderer(this);
        this.armbase7.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase7.addChild(armbase7);
        this.armbase7.cubeList.add(new ModelBox(armbase7, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma7 = new AdvancedModelRenderer(this);
        this.arma7.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase7.addChild(arma7);
        this.arma7.cubeList.add(new ModelBox(arma7, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc7 = new AdvancedModelRenderer(this);
        this.armc7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb7.addChild(armc7);
        this.armc7.cubeList.add(new ModelBox(armc7, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase13 = new AdvancedModelRenderer(this);
        this.armmiddlebase13.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase13);
        this.setRotateAngle(armmiddlebase13, 0.0F, 2.0944F, 0.0F);


        this.armbase13 = new AdvancedModelRenderer(this);
        this.armbase13.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase13.addChild(armbase13);
        this.armbase13.cubeList.add(new ModelBox(armbase13, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma13 = new AdvancedModelRenderer(this);
        this.arma13.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase13.addChild(arma13);
        this.arma13.cubeList.add(new ModelBox(arma13, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb13 = new AdvancedModelRenderer(this);
        this.armb13.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma13.addChild(armb13);
        this.armb13.cubeList.add(new ModelBox(armb13, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc13 = new AdvancedModelRenderer(this);
        this.armc13.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb13.addChild(armc13);
        this.armc13.cubeList.add(new ModelBox(armc13, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase9 = new AdvancedModelRenderer(this);
        this.armmiddlebase9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase9);
        this.setRotateAngle(armmiddlebase9, 0.0F, -2.7925F, 0.0F);


        this.armbase9 = new AdvancedModelRenderer(this);
        this.armbase9.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase9.addChild(armbase9);
        this.armbase9.cubeList.add(new ModelBox(armbase9, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma9 = new AdvancedModelRenderer(this);
        this.arma9.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase9.addChild(arma9);
        this.arma9.cubeList.add(new ModelBox(arma9, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc9 = new AdvancedModelRenderer(this);
        this.armc9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb9.addChild(armc9);
        this.armc9.cubeList.add(new ModelBox(armc9, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase11 = new AdvancedModelRenderer(this);
        this.armmiddlebase11.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase11);
        this.setRotateAngle(armmiddlebase11, 0.0F, 2.7925F, 0.0F);


        this.armbase11 = new AdvancedModelRenderer(this);
        this.armbase11.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase11.addChild(armbase11);
        this.armbase11.cubeList.add(new ModelBox(armbase11, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma11 = new AdvancedModelRenderer(this);
        this.arma11.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase11.addChild(arma11);
        this.arma11.cubeList.add(new ModelBox(arma11, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb11 = new AdvancedModelRenderer(this);
        this.armb11.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma11.addChild(armb11);
        this.armb11.cubeList.add(new ModelBox(armb11, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc11 = new AdvancedModelRenderer(this);
        this.armc11.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb11.addChild(armc11);
        this.armc11.cubeList.add(new ModelBox(armc11, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase2 = new AdvancedModelRenderer(this);
        this.armmiddlebase2.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase2);
        this.setRotateAngle(armmiddlebase2, 0.0F, -0.3491F, 0.0F);


        this.armbase2 = new AdvancedModelRenderer(this);
        this.armbase2.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase2.addChild(armbase2);
        this.armbase2.cubeList.add(new ModelBox(armbase2, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma2 = new AdvancedModelRenderer(this);
        this.arma2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase2.addChild(arma2);
        this.arma2.cubeList.add(new ModelBox(arma2, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc2 = new AdvancedModelRenderer(this);
        this.armc2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb2.addChild(armc2);
        this.armc2.cubeList.add(new ModelBox(armc2, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase18 = new AdvancedModelRenderer(this);
        this.armmiddlebase18.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase18);
        this.setRotateAngle(armmiddlebase18, 0.0F, 0.3491F, 0.0F);


        this.armbase18 = new AdvancedModelRenderer(this);
        this.armbase18.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase18.addChild(armbase18);
        this.armbase18.cubeList.add(new ModelBox(armbase18, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma18 = new AdvancedModelRenderer(this);
        this.arma18.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase18.addChild(arma18);
        this.arma18.cubeList.add(new ModelBox(arma18, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb18 = new AdvancedModelRenderer(this);
        this.armb18.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma18.addChild(armb18);
        this.armb18.cubeList.add(new ModelBox(armb18, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc18 = new AdvancedModelRenderer(this);
        this.armc18.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb18.addChild(armc18);
        this.armc18.cubeList.add(new ModelBox(armc18, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase8 = new AdvancedModelRenderer(this);
        this.armmiddlebase8.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase8);
        this.setRotateAngle(armmiddlebase8, 0.0F, -2.4435F, 0.0F);


        this.armbase8 = new AdvancedModelRenderer(this);
        this.armbase8.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase8.addChild(armbase8);
        this.armbase8.cubeList.add(new ModelBox(armbase8, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma8 = new AdvancedModelRenderer(this);
        this.arma8.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase8.addChild(arma8);
        this.arma8.cubeList.add(new ModelBox(arma8, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc8 = new AdvancedModelRenderer(this);
        this.armc8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb8.addChild(armc8);
        this.armc8.cubeList.add(new ModelBox(armc8, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase12 = new AdvancedModelRenderer(this);
        this.armmiddlebase12.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase12);
        this.setRotateAngle(armmiddlebase12, 0.0F, 2.4435F, 0.0F);


        this.armbase12 = new AdvancedModelRenderer(this);
        this.armbase12.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase12.addChild(armbase12);
        this.armbase12.cubeList.add(new ModelBox(armbase12, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma12 = new AdvancedModelRenderer(this);
        this.arma12.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase12.addChild(arma12);
        this.arma12.cubeList.add(new ModelBox(arma12, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb12 = new AdvancedModelRenderer(this);
        this.armb12.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma12.addChild(armb12);
        this.armb12.cubeList.add(new ModelBox(armb12, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc12 = new AdvancedModelRenderer(this);
        this.armc12.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb12.addChild(armc12);
        this.armc12.cubeList.add(new ModelBox(armc12, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase4 = new AdvancedModelRenderer(this);
        this.armmiddlebase4.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase4);
        this.setRotateAngle(armmiddlebase4, 0.0F, -1.0472F, 0.0F);


        this.armbase4 = new AdvancedModelRenderer(this);
        this.armbase4.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase4.addChild(armbase4);
        this.armbase4.cubeList.add(new ModelBox(armbase4, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma4 = new AdvancedModelRenderer(this);
        this.arma4.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase4.addChild(arma4);
        this.arma4.cubeList.add(new ModelBox(arma4, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc4 = new AdvancedModelRenderer(this);
        this.armc4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb4.addChild(armc4);
        this.armc4.cubeList.add(new ModelBox(armc4, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase16 = new AdvancedModelRenderer(this);
        this.armmiddlebase16.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase16);
        this.setRotateAngle(armmiddlebase16, 0.0F, 1.0472F, 0.0F);


        this.armbase16 = new AdvancedModelRenderer(this);
        this.armbase16.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase16.addChild(armbase16);
        this.armbase16.cubeList.add(new ModelBox(armbase16, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma16 = new AdvancedModelRenderer(this);
        this.arma16.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase16.addChild(arma16);
        this.arma16.cubeList.add(new ModelBox(arma16, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb16 = new AdvancedModelRenderer(this);
        this.armb16.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma16.addChild(armb16);
        this.armb16.cubeList.add(new ModelBox(armb16, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc16 = new AdvancedModelRenderer(this);
        this.armc16.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb16.addChild(armc16);
        this.armc16.cubeList.add(new ModelBox(armc16, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armmiddlebase6 = new AdvancedModelRenderer(this);
        this.armmiddlebase6.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase6);
        this.setRotateAngle(armmiddlebase6, 0.0F, -1.7453F, 0.0F);


        this.armbase6 = new AdvancedModelRenderer(this);
        this.armbase6.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase6.addChild(armbase6);
        this.armbase6.cubeList.add(new ModelBox(armbase6, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.arma6 = new AdvancedModelRenderer(this);
        this.arma6.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase6.addChild(arma6);
        this.arma6.cubeList.add(new ModelBox(arma6, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.armc6 = new AdvancedModelRenderer(this);
        this.armc6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb6.addChild(armc6);
        this.armc6.cubeList.add(new ModelBox(armc6, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armmiddlebase14 = new AdvancedModelRenderer(this);
        this.armmiddlebase14.setRotationPoint(0.0F, 0.025F, -1.0F);
        this.core.addChild(armmiddlebase14);
        this.setRotateAngle(armmiddlebase14, 0.0F, 1.7453F, 0.0F);


        this.armbase14 = new AdvancedModelRenderer(this);
        this.armbase14.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.armmiddlebase14.addChild(armbase14);
        this.armbase14.cubeList.add(new ModelBox(armbase14, 7, 17, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.arma14 = new AdvancedModelRenderer(this);
        this.arma14.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.armbase14.addChild(arma14);
        this.arma14.cubeList.add(new ModelBox(arma14, 0, 10, -1.0F, -0.51F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armb14 = new AdvancedModelRenderer(this);
        this.armb14.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arma14.addChild(armb14);
        this.armb14.cubeList.add(new ModelBox(armb14, 9, 11, -1.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.armc14 = new AdvancedModelRenderer(this);
        this.armc14.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.armb14.addChild(armc14);
        this.armc14.cubeList.add(new ModelBox(armc14, 0, 16, -0.5F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

       // this.root.offsetY = 1.29F;
        AdvancedModelRenderer[] Arm1 = {this.armbase, this.arma, this.armb, this.armc};
        AdvancedModelRenderer[] Arm2 = {this.armbase2, this.arma2, this.armb2, this.armc2};
        AdvancedModelRenderer[] Arm3 = {this.armbase3, this.arma3, this.armb3, this.armc3};
        AdvancedModelRenderer[] Arm4 = {this.armbase4, this.arma4, this.armb4, this.armc4};
        AdvancedModelRenderer[] Arm5 = {this.armbase5, this.arma5, this.armb5, this.armc5};
        AdvancedModelRenderer[] Arm6 = {this.armbase6, this.arma6, this.armb6, this.armc6};
        AdvancedModelRenderer[] Arm7 = {this.armbase7, this.arma7, this.armb7, this.armc7};
        AdvancedModelRenderer[] Arm8 = {this.armbase8, this.arma8, this.armb8, this.armc8};
        AdvancedModelRenderer[] Arm9 = {this.armbase9, this.arma9, this.armb9, this.armc9};
        AdvancedModelRenderer[] Arm10 = {this.armbase10, this.arma10, this.armb10, this.armc10};
        AdvancedModelRenderer[] Arm11 = {this.armbase11, this.arma11, this.armb11, this.armc11};
        AdvancedModelRenderer[] Arm12 = {this.armbase12, this.arma12, this.armb12, this.armc12};
        AdvancedModelRenderer[] Arm13 = {this.armbase13, this.arma13, this.armb13, this.armc13};
        AdvancedModelRenderer[] Arm14 = {this.armbase14, this.arma14, this.armb14, this.armc14};
        AdvancedModelRenderer[] Arm15 = {this.armbase15, this.arma15, this.armb15, this.armc15};
        AdvancedModelRenderer[] Arm16 = {this.armbase16, this.arma16, this.armb16, this.armc16};
        AdvancedModelRenderer[] Arm17 = {this.armbase17, this.arma17, this.armb17, this.armc17};
        AdvancedModelRenderer[] Arm18 = {this.armbase18, this.arma18, this.armb18, this.armc18};

        float speed = 0.135F;
        float modifier = 1f;
        if (f3 == 0) {
            modifier = 0.5F;
        }
        this.chainSwing(Arm1, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm2, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm3, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm4, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm5, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm6, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm7, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm8, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm9, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm10, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm11, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm12, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm13, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm14, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm15, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm16, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm17, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
        this.chainSwing(Arm18, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);

    }
}
