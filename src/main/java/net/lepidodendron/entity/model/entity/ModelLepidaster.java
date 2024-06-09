package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLepidaster extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer core;
    private final AdvancedModelRenderer armmiddlebase;
    private final AdvancedModelRenderer armbase;
    private final AdvancedModelRenderer arma;
    private final AdvancedModelRenderer armb;
    private final AdvancedModelRenderer armmiddlebase2;
    private final AdvancedModelRenderer armbase2;
    private final AdvancedModelRenderer arma2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer armmiddlebase3;
    private final AdvancedModelRenderer armbase3;
    private final AdvancedModelRenderer arma3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer armmiddlebase4;
    private final AdvancedModelRenderer armbase4;
    private final AdvancedModelRenderer arma4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer armmiddlebase5;
    private final AdvancedModelRenderer armbase5;
    private final AdvancedModelRenderer arma5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer armmiddlebase6;
    private final AdvancedModelRenderer armbase6;
    private final AdvancedModelRenderer arma6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer armmiddlebase7;
    private final AdvancedModelRenderer armbase7;
    private final AdvancedModelRenderer arma7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer armmiddlebase8;
    private final AdvancedModelRenderer armbase8;
    private final AdvancedModelRenderer arma8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer armmiddlebase9;
    private final AdvancedModelRenderer armbase9;
    private final AdvancedModelRenderer arma9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer armmiddlebase10;
    private final AdvancedModelRenderer armbase10;
    private final AdvancedModelRenderer arma10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer armmiddlebase11;
    private final AdvancedModelRenderer armbase11;
    private final AdvancedModelRenderer arma11;
    private final AdvancedModelRenderer armb11;
    private final AdvancedModelRenderer armmiddlebase12;
    private final AdvancedModelRenderer armbase12;
    private final AdvancedModelRenderer arma12;
    private final AdvancedModelRenderer armb12;
    private final AdvancedModelRenderer armmiddlebase13;
    private final AdvancedModelRenderer armbase13;
    private final AdvancedModelRenderer arma13;
    private final AdvancedModelRenderer armb13;

    public ModelLepidaster() {
        this.textureWidth = 23;
        this.textureHeight = 23;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.core = new AdvancedModelRenderer(this);
        this.core.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.root.addChild(core);
        this.core.cubeList.add(new ModelBox(core, 0, 0, -2.0F, -1.325F, -3.0F, 4, 1, 4, 0.0F, false));
        this.core.cubeList.add(new ModelBox(core, 0, 15, -2.5F, -1.125F, -3.5F, 5, 1, 5, 0.0F, false));

        this.armmiddlebase = new AdvancedModelRenderer(this);
        this.armmiddlebase.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase);


        this.armbase = new AdvancedModelRenderer(this);
        this.armbase.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase.addChild(armbase);
        this.armbase.cubeList.add(new ModelBox(armbase, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma = new AdvancedModelRenderer(this);
        this.arma.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase.addChild(arma);
        this.arma.cubeList.add(new ModelBox(arma, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb = new AdvancedModelRenderer(this);
        this.armb.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma.addChild(armb);
        this.armb.cubeList.add(new ModelBox(armb, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb.cubeList.add(new ModelBox(armb, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase2 = new AdvancedModelRenderer(this);
        this.armmiddlebase2.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase2);
        this.setRotateAngle(armmiddlebase2, 0.0F, -0.4833F, 0.0F);


        this.armbase2 = new AdvancedModelRenderer(this);
        this.armbase2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase2.addChild(armbase2);
        this.armbase2.cubeList.add(new ModelBox(armbase2, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma2 = new AdvancedModelRenderer(this);
        this.arma2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase2.addChild(arma2);
        this.arma2.cubeList.add(new ModelBox(arma2, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb2.cubeList.add(new ModelBox(armb2, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase3 = new AdvancedModelRenderer(this);
        this.armmiddlebase3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase3);
        this.setRotateAngle(armmiddlebase3, 0.0F, -0.9666F, 0.0F);


        this.armbase3 = new AdvancedModelRenderer(this);
        this.armbase3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase3.addChild(armbase3);
        this.armbase3.cubeList.add(new ModelBox(armbase3, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma3 = new AdvancedModelRenderer(this);
        this.arma3.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase3.addChild(arma3);
        this.arma3.cubeList.add(new ModelBox(arma3, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb3.cubeList.add(new ModelBox(armb3, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase4 = new AdvancedModelRenderer(this);
        this.armmiddlebase4.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase4);
        this.setRotateAngle(armmiddlebase4, 0.0F, -1.4498F, 0.0F);


        this.armbase4 = new AdvancedModelRenderer(this);
        this.armbase4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase4.addChild(armbase4);
        this.armbase4.cubeList.add(new ModelBox(armbase4, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma4 = new AdvancedModelRenderer(this);
        this.arma4.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase4.addChild(arma4);
        this.arma4.cubeList.add(new ModelBox(arma4, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb4.cubeList.add(new ModelBox(armb4, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase5 = new AdvancedModelRenderer(this);
        this.armmiddlebase5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase5);
        this.setRotateAngle(armmiddlebase5, 0.0F, -1.9333F, 0.0F);


        this.armbase5 = new AdvancedModelRenderer(this);
        this.armbase5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase5.addChild(armbase5);
        this.armbase5.cubeList.add(new ModelBox(armbase5, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma5 = new AdvancedModelRenderer(this);
        this.arma5.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase5.addChild(arma5);
        this.arma5.cubeList.add(new ModelBox(arma5, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb5.cubeList.add(new ModelBox(armb5, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase6 = new AdvancedModelRenderer(this);
        this.armmiddlebase6.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase6);
        this.setRotateAngle(armmiddlebase6, 0.0F, -2.4166F, 0.0F);


        this.armbase6 = new AdvancedModelRenderer(this);
        this.armbase6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase6.addChild(armbase6);
        this.armbase6.cubeList.add(new ModelBox(armbase6, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma6 = new AdvancedModelRenderer(this);
        this.arma6.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase6.addChild(arma6);
        this.arma6.cubeList.add(new ModelBox(arma6, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb6.cubeList.add(new ModelBox(armb6, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase7 = new AdvancedModelRenderer(this);
        this.armmiddlebase7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase7);
        this.setRotateAngle(armmiddlebase7, 0.0F, -2.8999F, 0.0F);


        this.armbase7 = new AdvancedModelRenderer(this);
        this.armbase7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase7.addChild(armbase7);
        this.armbase7.cubeList.add(new ModelBox(armbase7, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma7 = new AdvancedModelRenderer(this);
        this.arma7.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase7.addChild(arma7);
        this.arma7.cubeList.add(new ModelBox(arma7, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb7.cubeList.add(new ModelBox(armb7, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase8 = new AdvancedModelRenderer(this);
        this.armmiddlebase8.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase8);
        this.setRotateAngle(armmiddlebase8, 0.0F, 2.8999F, 0.0F);


        this.armbase8 = new AdvancedModelRenderer(this);
        this.armbase8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase8.addChild(armbase8);
        this.armbase8.cubeList.add(new ModelBox(armbase8, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma8 = new AdvancedModelRenderer(this);
        this.arma8.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase8.addChild(arma8);
        this.arma8.cubeList.add(new ModelBox(arma8, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb8.cubeList.add(new ModelBox(armb8, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase9 = new AdvancedModelRenderer(this);
        this.armmiddlebase9.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase9);
        this.setRotateAngle(armmiddlebase9, 0.0F, 2.4166F, 0.0F);


        this.armbase9 = new AdvancedModelRenderer(this);
        this.armbase9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase9.addChild(armbase9);
        this.armbase9.cubeList.add(new ModelBox(armbase9, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma9 = new AdvancedModelRenderer(this);
        this.arma9.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase9.addChild(arma9);
        this.arma9.cubeList.add(new ModelBox(arma9, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb9.cubeList.add(new ModelBox(armb9, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase10 = new AdvancedModelRenderer(this);
        this.armmiddlebase10.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase10);
        this.setRotateAngle(armmiddlebase10, 0.0F, 1.9333F, 0.0F);


        this.armbase10 = new AdvancedModelRenderer(this);
        this.armbase10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase10.addChild(armbase10);
        this.armbase10.cubeList.add(new ModelBox(armbase10, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma10 = new AdvancedModelRenderer(this);
        this.arma10.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase10.addChild(arma10);
        this.arma10.cubeList.add(new ModelBox(arma10, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb10.cubeList.add(new ModelBox(armb10, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase11 = new AdvancedModelRenderer(this);
        this.armmiddlebase11.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase11);
        this.setRotateAngle(armmiddlebase11, 0.0F, 1.4498F, 0.0F);


        this.armbase11 = new AdvancedModelRenderer(this);
        this.armbase11.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase11.addChild(armbase11);
        this.armbase11.cubeList.add(new ModelBox(armbase11, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma11 = new AdvancedModelRenderer(this);
        this.arma11.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase11.addChild(arma11);
        this.arma11.cubeList.add(new ModelBox(arma11, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb11 = new AdvancedModelRenderer(this);
        this.armb11.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma11.addChild(armb11);
        this.armb11.cubeList.add(new ModelBox(armb11, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb11.cubeList.add(new ModelBox(armb11, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase12 = new AdvancedModelRenderer(this);
        this.armmiddlebase12.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.core.addChild(armmiddlebase12);
        this.setRotateAngle(armmiddlebase12, 0.0F, 0.9666F, 0.0F);


        this.armbase12 = new AdvancedModelRenderer(this);
        this.armbase12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase12.addChild(armbase12);
        this.armbase12.cubeList.add(new ModelBox(armbase12, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma12 = new AdvancedModelRenderer(this);
        this.arma12.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase12.addChild(arma12);
        this.arma12.cubeList.add(new ModelBox(arma12, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb12 = new AdvancedModelRenderer(this);
        this.armb12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma12.addChild(armb12);
        this.armb12.cubeList.add(new ModelBox(armb12, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb12.cubeList.add(new ModelBox(armb12, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));

        this.armmiddlebase13 = new AdvancedModelRenderer(this);
        this.armmiddlebase13.setRotationPoint(0.0F, -0.05F, -1.0F);
        this.core.addChild(armmiddlebase13);
        this.setRotateAngle(armmiddlebase13, 0.0F, 0.4833F, 0.0F);


        this.armbase13 = new AdvancedModelRenderer(this);
        this.armbase13.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.armmiddlebase13.addChild(armbase13);
        this.armbase13.cubeList.add(new ModelBox(armbase13, 0, 6, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.arma13 = new AdvancedModelRenderer(this);
        this.arma13.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.armbase13.addChild(arma13);
        this.arma13.cubeList.add(new ModelBox(arma13, 8, 6, -1.0F, -0.51F, -3.0F, 2, 1, 3, 0.0F, false));

        this.armb13 = new AdvancedModelRenderer(this);
        this.armb13.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arma13.addChild(armb13);
        this.armb13.cubeList.add(new ModelBox(armb13, 10, 10, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));
        this.armb13.cubeList.add(new ModelBox(armb13, 0, 0, -0.5F, -0.5F, -3.0F, 1, 1, 1, 0.0F, false));


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

        //this.root.offsetY = 1.29F;
        AdvancedModelRenderer[] Arm1 = {this.armbase, this.arma, this.armb};
        AdvancedModelRenderer[] Arm2 = {this.armbase2, this.arma2, this.armb2};
        AdvancedModelRenderer[] Arm3 = {this.armbase3, this.arma3, this.armb3};
        AdvancedModelRenderer[] Arm4 = {this.armbase4, this.arma4, this.armb4};
        AdvancedModelRenderer[] Arm5 = {this.armbase5, this.arma5, this.armb5};
        AdvancedModelRenderer[] Arm6 = {this.armbase6, this.arma6, this.armb6};
        AdvancedModelRenderer[] Arm7 = {this.armbase7, this.arma7, this.armb7};
        AdvancedModelRenderer[] Arm8 = {this.armbase8, this.arma8, this.armb8};
        AdvancedModelRenderer[] Arm9 = {this.armbase9, this.arma9, this.armb9};
        AdvancedModelRenderer[] Arm10 = {this.armbase10, this.arma10, this.armb10};
        AdvancedModelRenderer[] Arm11 = {this.armbase11, this.arma11, this.armb11};
        AdvancedModelRenderer[] Arm12 = {this.armbase12, this.arma12, this.armb12};
        AdvancedModelRenderer[] Arm13 = {this.armbase13, this.arma13, this.armb13};

        float speed = 0.15F;
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

    }
}
