package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelAnthracomedusa extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legbase1_r1;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacleB;
    private final AdvancedModelRenderer tentacleC;
    private final AdvancedModelRenderer tentacleD;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacleB2;
    private final AdvancedModelRenderer tentacleC2;
    private final AdvancedModelRenderer tentacleD2;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacleB3;
    private final AdvancedModelRenderer tentacleC3;
    private final AdvancedModelRenderer tentacleD3;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacleB4;
    private final AdvancedModelRenderer tentacleC4;
    private final AdvancedModelRenderer tentacleD4;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacleB5;
    private final AdvancedModelRenderer tentacleC5;
    private final AdvancedModelRenderer tentacleD5;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacleB6;
    private final AdvancedModelRenderer tentacleC6;
    private final AdvancedModelRenderer tentacleD6;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacleB7;
    private final AdvancedModelRenderer tentacleC7;
    private final AdvancedModelRenderer tentacleD7;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacleB8;
    private final AdvancedModelRenderer tentacleC8;
    private final AdvancedModelRenderer tentacleD8;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacleB9;
    private final AdvancedModelRenderer tentacleC9;
    private final AdvancedModelRenderer tentacleD9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacleB10;
    private final AdvancedModelRenderer tentacleC10;
    private final AdvancedModelRenderer tentacleD10;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacleB11;
    private final AdvancedModelRenderer tentacleC11;
    private final AdvancedModelRenderer tentacleD11;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacleB12;
    private final AdvancedModelRenderer tentacleC12;
    private final AdvancedModelRenderer tentacleD12;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacleB13;
    private final AdvancedModelRenderer tentacleC13;
    private final AdvancedModelRenderer tentacleD13;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacleB14;
    private final AdvancedModelRenderer tentacleC14;
    private final AdvancedModelRenderer tentacleD14;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacleB15;
    private final AdvancedModelRenderer tentacleC15;
    private final AdvancedModelRenderer tentacleD15;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacleB16;
    private final AdvancedModelRenderer tentacleC16;
    private final AdvancedModelRenderer tentacleD16;
    private final AdvancedModelRenderer tentacle17;
    private final AdvancedModelRenderer tentacleB17;
    private final AdvancedModelRenderer tentacleC17;
    private final AdvancedModelRenderer tentacleD17;
    private final AdvancedModelRenderer tentacle18;
    private final AdvancedModelRenderer tentacleB18;
    private final AdvancedModelRenderer tentacleC18;
    private final AdvancedModelRenderer tentacleD18;
    private final AdvancedModelRenderer tentacle19;
    private final AdvancedModelRenderer tentacleB19;
    private final AdvancedModelRenderer tentacleC19;
    private final AdvancedModelRenderer tentacleD19;
    private final AdvancedModelRenderer tentacle20;
    private final AdvancedModelRenderer tentacleB20;
    private final AdvancedModelRenderer tentacleC20;
    private final AdvancedModelRenderer tentacleD20;
    private final AdvancedModelRenderer tentacle21;
    private final AdvancedModelRenderer tentacleB21;
    private final AdvancedModelRenderer tentacleC21;
    private final AdvancedModelRenderer tentacleD21;
    private final AdvancedModelRenderer tentacle22;
    private final AdvancedModelRenderer tentacleB22;
    private final AdvancedModelRenderer tentacleC22;
    private final AdvancedModelRenderer tentacleD22;
    private final AdvancedModelRenderer tentacle23;
    private final AdvancedModelRenderer tentacleB23;
    private final AdvancedModelRenderer tentacleC23;
    private final AdvancedModelRenderer tentacleD23;
    private final AdvancedModelRenderer tentacle24;
    private final AdvancedModelRenderer tentacleB24;
    private final AdvancedModelRenderer tentacleC24;
    private final AdvancedModelRenderer tentacleD24;
    private final AdvancedModelRenderer tentacle25;
    private final AdvancedModelRenderer tentacleB25;
    private final AdvancedModelRenderer tentacleC25;
    private final AdvancedModelRenderer tentacleD25;
    private final AdvancedModelRenderer tentacle26;
    private final AdvancedModelRenderer tentacleB26;
    private final AdvancedModelRenderer tentacleC26;
    private final AdvancedModelRenderer tentacleD26;
    private final AdvancedModelRenderer tentacle27;
    private final AdvancedModelRenderer tentacleB27;
    private final AdvancedModelRenderer tentacleC27;
    private final AdvancedModelRenderer tentacleD27;
    private final AdvancedModelRenderer tentacle28;
    private final AdvancedModelRenderer tentacleB28;
    private final AdvancedModelRenderer tentacleC28;
    private final AdvancedModelRenderer tentacleD28;
    private final AdvancedModelRenderer tentacle29;
    private final AdvancedModelRenderer tentacleB29;
    private final AdvancedModelRenderer tentacleC29;
    private final AdvancedModelRenderer tentacleD29;
    private final AdvancedModelRenderer tentacle30;
    private final AdvancedModelRenderer tentacleB30;
    private final AdvancedModelRenderer tentacleC30;
    private final AdvancedModelRenderer tentacleD30;
    private final AdvancedModelRenderer tentacle31;
    private final AdvancedModelRenderer tentacleB31;
    private final AdvancedModelRenderer tentacleC31;
    private final AdvancedModelRenderer tentacleD31;
    private final AdvancedModelRenderer tentacle32;
    private final AdvancedModelRenderer tentacleB32;
    private final AdvancedModelRenderer tentacleC32;
    private final AdvancedModelRenderer tentacleD32;

    public ModelAnthracomedusa() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -18.0F, -4.0F, 8, 8, 8, 0.0F, false));

        this.legbase1_r1 = new AdvancedModelRenderer(this);
        this.legbase1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(legbase1_r1);
        this.setRotateAngle(legbase1_r1, 0.0F, -0.7854F, 0.0F);
        this.legbase1_r1.cubeList.add(new ModelBox(legbase1_r1, 23, 16, -6.0F, -11.0F, -1.0F, 2, 2, 2, 0.0F, false));
        this.legbase1_r1.cubeList.add(new ModelBox(legbase1_r1, 15, 16, 4.0F, -11.0F, -1.0F, 2, 2, 2, 0.0F, false));
        this.legbase1_r1.cubeList.add(new ModelBox(legbase1_r1, 0, 4, -1.0F, -11.0F, -6.0F, 2, 2, 2, 0.0F, false));
        this.legbase1_r1.cubeList.add(new ModelBox(legbase1_r1, 0, 0, -1.0F, -11.0F, 4.0F, 2, 2, 2, 0.0F, false));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(-3.5F, -9.0F, 4.5F);
        this.body.addChild(tentacle);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB = new AdvancedModelRenderer(this);
        this.tentacleB.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle.addChild(tentacleB);
        this.tentacleB.cubeList.add(new ModelBox(tentacleB, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC = new AdvancedModelRenderer(this);
        this.tentacleC.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB.addChild(tentacleC);
        this.tentacleC.cubeList.add(new ModelBox(tentacleC, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD = new AdvancedModelRenderer(this);
        this.tentacleD.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC.addChild(tentacleD);
        this.tentacleD.cubeList.add(new ModelBox(tentacleD, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(3.5F, -9.0F, 4.5F);
        this.body.addChild(tentacle2);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB2 = new AdvancedModelRenderer(this);
        this.tentacleB2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle2.addChild(tentacleB2);
        this.tentacleB2.cubeList.add(new ModelBox(tentacleB2, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC2 = new AdvancedModelRenderer(this);
        this.tentacleC2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB2.addChild(tentacleC2);
        this.tentacleC2.cubeList.add(new ModelBox(tentacleC2, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD2 = new AdvancedModelRenderer(this);
        this.tentacleD2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC2.addChild(tentacleD2);
        this.tentacleD2.cubeList.add(new ModelBox(tentacleD2, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(3.5F, -9.0F, 2.5F);
        this.body.addChild(tentacle3);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB3 = new AdvancedModelRenderer(this);
        this.tentacleB3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle3.addChild(tentacleB3);
        this.tentacleB3.cubeList.add(new ModelBox(tentacleB3, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC3 = new AdvancedModelRenderer(this);
        this.tentacleC3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB3.addChild(tentacleC3);
        this.tentacleC3.cubeList.add(new ModelBox(tentacleC3, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD3 = new AdvancedModelRenderer(this);
        this.tentacleD3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC3.addChild(tentacleD3);
        this.tentacleD3.cubeList.add(new ModelBox(tentacleD3, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(-3.5F, -9.0F, 2.5F);
        this.body.addChild(tentacle4);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB4 = new AdvancedModelRenderer(this);
        this.tentacleB4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle4.addChild(tentacleB4);
        this.tentacleB4.cubeList.add(new ModelBox(tentacleB4, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC4 = new AdvancedModelRenderer(this);
        this.tentacleC4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB4.addChild(tentacleC4);
        this.tentacleC4.cubeList.add(new ModelBox(tentacleC4, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD4 = new AdvancedModelRenderer(this);
        this.tentacleD4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC4.addChild(tentacleD4);
        this.tentacleD4.cubeList.add(new ModelBox(tentacleD4, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(-3.5F, -9.0F, -4.5F);
        this.body.addChild(tentacle5);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB5 = new AdvancedModelRenderer(this);
        this.tentacleB5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle5.addChild(tentacleB5);
        this.tentacleB5.cubeList.add(new ModelBox(tentacleB5, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC5 = new AdvancedModelRenderer(this);
        this.tentacleC5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB5.addChild(tentacleC5);
        this.tentacleC5.cubeList.add(new ModelBox(tentacleC5, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD5 = new AdvancedModelRenderer(this);
        this.tentacleD5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC5.addChild(tentacleD5);
        this.tentacleD5.cubeList.add(new ModelBox(tentacleD5, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(3.5F, -9.0F, -4.5F);
        this.body.addChild(tentacle6);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB6 = new AdvancedModelRenderer(this);
        this.tentacleB6.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle6.addChild(tentacleB6);
        this.tentacleB6.cubeList.add(new ModelBox(tentacleB6, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC6 = new AdvancedModelRenderer(this);
        this.tentacleC6.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB6.addChild(tentacleC6);
        this.tentacleC6.cubeList.add(new ModelBox(tentacleC6, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD6 = new AdvancedModelRenderer(this);
        this.tentacleD6.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC6.addChild(tentacleD6);
        this.tentacleD6.cubeList.add(new ModelBox(tentacleD6, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(3.5F, -9.0F, -2.5F);
        this.body.addChild(tentacle7);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB7 = new AdvancedModelRenderer(this);
        this.tentacleB7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle7.addChild(tentacleB7);
        this.tentacleB7.cubeList.add(new ModelBox(tentacleB7, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC7 = new AdvancedModelRenderer(this);
        this.tentacleC7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB7.addChild(tentacleC7);
        this.tentacleC7.cubeList.add(new ModelBox(tentacleC7, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD7 = new AdvancedModelRenderer(this);
        this.tentacleD7.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC7.addChild(tentacleD7);
        this.tentacleD7.cubeList.add(new ModelBox(tentacleD7, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(-3.5F, -9.0F, -2.5F);
        this.body.addChild(tentacle8);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB8 = new AdvancedModelRenderer(this);
        this.tentacleB8.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle8.addChild(tentacleB8);
        this.tentacleB8.cubeList.add(new ModelBox(tentacleB8, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC8 = new AdvancedModelRenderer(this);
        this.tentacleC8.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB8.addChild(tentacleC8);
        this.tentacleC8.cubeList.add(new ModelBox(tentacleC8, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD8 = new AdvancedModelRenderer(this);
        this.tentacleD8.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC8.addChild(tentacleD8);
        this.tentacleD8.cubeList.add(new ModelBox(tentacleD8, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(-4.0F, -9.0F, 4.0F);
        this.body.addChild(tentacle9);
        this.setRotateAngle(tentacle9, 0.0F, -0.7854F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB9 = new AdvancedModelRenderer(this);
        this.tentacleB9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle9.addChild(tentacleB9);
        this.tentacleB9.cubeList.add(new ModelBox(tentacleB9, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC9 = new AdvancedModelRenderer(this);
        this.tentacleC9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB9.addChild(tentacleC9);
        this.tentacleC9.cubeList.add(new ModelBox(tentacleC9, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD9 = new AdvancedModelRenderer(this);
        this.tentacleD9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC9.addChild(tentacleD9);
        this.tentacleD9.cubeList.add(new ModelBox(tentacleD9, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(3.0F, -9.0F, 4.0F);
        this.body.addChild(tentacle10);
        this.setRotateAngle(tentacle10, 0.0F, -0.7854F, 0.0F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB10 = new AdvancedModelRenderer(this);
        this.tentacleB10.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle10.addChild(tentacleB10);
        this.tentacleB10.cubeList.add(new ModelBox(tentacleB10, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC10 = new AdvancedModelRenderer(this);
        this.tentacleC10.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB10.addChild(tentacleC10);
        this.tentacleC10.cubeList.add(new ModelBox(tentacleC10, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD10 = new AdvancedModelRenderer(this);
        this.tentacleD10.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC10.addChild(tentacleD10);
        this.tentacleD10.cubeList.add(new ModelBox(tentacleD10, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(3.0F, -9.0F, -3.0F);
        this.body.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.0F, -0.7854F, 0.0F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB11 = new AdvancedModelRenderer(this);
        this.tentacleB11.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle11.addChild(tentacleB11);
        this.tentacleB11.cubeList.add(new ModelBox(tentacleB11, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC11 = new AdvancedModelRenderer(this);
        this.tentacleC11.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB11.addChild(tentacleC11);
        this.tentacleC11.cubeList.add(new ModelBox(tentacleC11, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD11 = new AdvancedModelRenderer(this);
        this.tentacleD11.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC11.addChild(tentacleD11);
        this.tentacleD11.cubeList.add(new ModelBox(tentacleD11, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(-4.0F, -9.0F, -3.0F);
        this.body.addChild(tentacle12);
        this.setRotateAngle(tentacle12, 0.0F, -0.7854F, 0.0F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB12 = new AdvancedModelRenderer(this);
        this.tentacleB12.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle12.addChild(tentacleB12);
        this.tentacleB12.cubeList.add(new ModelBox(tentacleB12, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC12 = new AdvancedModelRenderer(this);
        this.tentacleC12.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB12.addChild(tentacleC12);
        this.tentacleC12.cubeList.add(new ModelBox(tentacleC12, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD12 = new AdvancedModelRenderer(this);
        this.tentacleD12.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC12.addChild(tentacleD12);
        this.tentacleD12.cubeList.add(new ModelBox(tentacleD12, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(-3.0F, -9.0F, -4.0F);
        this.body.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.0F, -0.7854F, 0.0F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB13 = new AdvancedModelRenderer(this);
        this.tentacleB13.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle13.addChild(tentacleB13);
        this.tentacleB13.cubeList.add(new ModelBox(tentacleB13, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC13 = new AdvancedModelRenderer(this);
        this.tentacleC13.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB13.addChild(tentacleC13);
        this.tentacleC13.cubeList.add(new ModelBox(tentacleC13, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD13 = new AdvancedModelRenderer(this);
        this.tentacleD13.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC13.addChild(tentacleD13);
        this.tentacleD13.cubeList.add(new ModelBox(tentacleD13, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(4.0F, -9.0F, -4.0F);
        this.body.addChild(tentacle14);
        this.setRotateAngle(tentacle14, 0.0F, -0.7854F, 0.0F);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB14 = new AdvancedModelRenderer(this);
        this.tentacleB14.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle14.addChild(tentacleB14);
        this.tentacleB14.cubeList.add(new ModelBox(tentacleB14, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC14 = new AdvancedModelRenderer(this);
        this.tentacleC14.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB14.addChild(tentacleC14);
        this.tentacleC14.cubeList.add(new ModelBox(tentacleC14, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD14 = new AdvancedModelRenderer(this);
        this.tentacleD14.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC14.addChild(tentacleD14);
        this.tentacleD14.cubeList.add(new ModelBox(tentacleD14, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(4.0F, -9.0F, 3.0F);
        this.body.addChild(tentacle15);
        this.setRotateAngle(tentacle15, 0.0F, -0.7854F, 0.0F);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB15 = new AdvancedModelRenderer(this);
        this.tentacleB15.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle15.addChild(tentacleB15);
        this.tentacleB15.cubeList.add(new ModelBox(tentacleB15, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC15 = new AdvancedModelRenderer(this);
        this.tentacleC15.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB15.addChild(tentacleC15);
        this.tentacleC15.cubeList.add(new ModelBox(tentacleC15, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD15 = new AdvancedModelRenderer(this);
        this.tentacleD15.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC15.addChild(tentacleD15);
        this.tentacleD15.cubeList.add(new ModelBox(tentacleD15, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(-3.0F, -9.0F, 3.0F);
        this.body.addChild(tentacle16);
        this.setRotateAngle(tentacle16, 0.0F, -0.7854F, 0.0F);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB16 = new AdvancedModelRenderer(this);
        this.tentacleB16.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle16.addChild(tentacleB16);
        this.tentacleB16.cubeList.add(new ModelBox(tentacleB16, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC16 = new AdvancedModelRenderer(this);
        this.tentacleC16.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB16.addChild(tentacleC16);
        this.tentacleC16.cubeList.add(new ModelBox(tentacleC16, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD16 = new AdvancedModelRenderer(this);
        this.tentacleD16.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC16.addChild(tentacleD16);
        this.tentacleD16.cubeList.add(new ModelBox(tentacleD16, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle17 = new AdvancedModelRenderer(this);
        this.tentacle17.setRotationPoint(-4.5F, -9.0F, 3.5F);
        this.body.addChild(tentacle17);
        this.setRotateAngle(tentacle17, 0.0F, -1.5708F, 0.0F);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB17 = new AdvancedModelRenderer(this);
        this.tentacleB17.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle17.addChild(tentacleB17);
        this.tentacleB17.cubeList.add(new ModelBox(tentacleB17, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC17 = new AdvancedModelRenderer(this);
        this.tentacleC17.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB17.addChild(tentacleC17);
        this.tentacleC17.cubeList.add(new ModelBox(tentacleC17, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD17 = new AdvancedModelRenderer(this);
        this.tentacleD17.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC17.addChild(tentacleD17);
        this.tentacleD17.cubeList.add(new ModelBox(tentacleD17, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle18 = new AdvancedModelRenderer(this);
        this.tentacle18.setRotationPoint(2.5F, -9.0F, 3.5F);
        this.body.addChild(tentacle18);
        this.setRotateAngle(tentacle18, 0.0F, -1.5708F, 0.0F);
        this.tentacle18.cubeList.add(new ModelBox(tentacle18, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB18 = new AdvancedModelRenderer(this);
        this.tentacleB18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle18.addChild(tentacleB18);
        this.tentacleB18.cubeList.add(new ModelBox(tentacleB18, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC18 = new AdvancedModelRenderer(this);
        this.tentacleC18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB18.addChild(tentacleC18);
        this.tentacleC18.cubeList.add(new ModelBox(tentacleC18, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD18 = new AdvancedModelRenderer(this);
        this.tentacleD18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC18.addChild(tentacleD18);
        this.tentacleD18.cubeList.add(new ModelBox(tentacleD18, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle19 = new AdvancedModelRenderer(this);
        this.tentacle19.setRotationPoint(2.5F, -9.0F, -3.5F);
        this.body.addChild(tentacle19);
        this.setRotateAngle(tentacle19, 0.0F, -1.5708F, 0.0F);
        this.tentacle19.cubeList.add(new ModelBox(tentacle19, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB19 = new AdvancedModelRenderer(this);
        this.tentacleB19.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle19.addChild(tentacleB19);
        this.tentacleB19.cubeList.add(new ModelBox(tentacleB19, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC19 = new AdvancedModelRenderer(this);
        this.tentacleC19.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB19.addChild(tentacleC19);
        this.tentacleC19.cubeList.add(new ModelBox(tentacleC19, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD19 = new AdvancedModelRenderer(this);
        this.tentacleD19.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC19.addChild(tentacleD19);
        this.tentacleD19.cubeList.add(new ModelBox(tentacleD19, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle20 = new AdvancedModelRenderer(this);
        this.tentacle20.setRotationPoint(-4.5F, -9.0F, -3.5F);
        this.body.addChild(tentacle20);
        this.setRotateAngle(tentacle20, 0.0F, -1.5708F, 0.0F);
        this.tentacle20.cubeList.add(new ModelBox(tentacle20, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB20 = new AdvancedModelRenderer(this);
        this.tentacleB20.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle20.addChild(tentacleB20);
        this.tentacleB20.cubeList.add(new ModelBox(tentacleB20, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC20 = new AdvancedModelRenderer(this);
        this.tentacleC20.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB20.addChild(tentacleC20);
        this.tentacleC20.cubeList.add(new ModelBox(tentacleC20, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD20 = new AdvancedModelRenderer(this);
        this.tentacleD20.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC20.addChild(tentacleD20);
        this.tentacleD20.cubeList.add(new ModelBox(tentacleD20, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle21 = new AdvancedModelRenderer(this);
        this.tentacle21.setRotationPoint(-2.5F, -9.0F, -3.5F);
        this.body.addChild(tentacle21);
        this.setRotateAngle(tentacle21, 0.0F, -1.5708F, 0.0F);
        this.tentacle21.cubeList.add(new ModelBox(tentacle21, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB21 = new AdvancedModelRenderer(this);
        this.tentacleB21.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle21.addChild(tentacleB21);
        this.tentacleB21.cubeList.add(new ModelBox(tentacleB21, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC21 = new AdvancedModelRenderer(this);
        this.tentacleC21.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB21.addChild(tentacleC21);
        this.tentacleC21.cubeList.add(new ModelBox(tentacleC21, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD21 = new AdvancedModelRenderer(this);
        this.tentacleD21.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC21.addChild(tentacleD21);
        this.tentacleD21.cubeList.add(new ModelBox(tentacleD21, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle22 = new AdvancedModelRenderer(this);
        this.tentacle22.setRotationPoint(4.5F, -9.0F, -3.5F);
        this.body.addChild(tentacle22);
        this.setRotateAngle(tentacle22, 0.0F, -1.5708F, 0.0F);
        this.tentacle22.cubeList.add(new ModelBox(tentacle22, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB22 = new AdvancedModelRenderer(this);
        this.tentacleB22.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle22.addChild(tentacleB22);
        this.tentacleB22.cubeList.add(new ModelBox(tentacleB22, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC22 = new AdvancedModelRenderer(this);
        this.tentacleC22.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB22.addChild(tentacleC22);
        this.tentacleC22.cubeList.add(new ModelBox(tentacleC22, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD22 = new AdvancedModelRenderer(this);
        this.tentacleD22.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC22.addChild(tentacleD22);
        this.tentacleD22.cubeList.add(new ModelBox(tentacleD22, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle23 = new AdvancedModelRenderer(this);
        this.tentacle23.setRotationPoint(4.5F, -9.0F, 3.5F);
        this.body.addChild(tentacle23);
        this.setRotateAngle(tentacle23, 0.0F, -1.5708F, 0.0F);
        this.tentacle23.cubeList.add(new ModelBox(tentacle23, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB23 = new AdvancedModelRenderer(this);
        this.tentacleB23.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle23.addChild(tentacleB23);
        this.tentacleB23.cubeList.add(new ModelBox(tentacleB23, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC23 = new AdvancedModelRenderer(this);
        this.tentacleC23.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB23.addChild(tentacleC23);
        this.tentacleC23.cubeList.add(new ModelBox(tentacleC23, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD23 = new AdvancedModelRenderer(this);
        this.tentacleD23.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC23.addChild(tentacleD23);
        this.tentacleD23.cubeList.add(new ModelBox(tentacleD23, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle24 = new AdvancedModelRenderer(this);
        this.tentacle24.setRotationPoint(-2.5F, -9.0F, 3.5F);
        this.body.addChild(tentacle24);
        this.setRotateAngle(tentacle24, 0.0F, -1.5708F, 0.0F);
        this.tentacle24.cubeList.add(new ModelBox(tentacle24, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB24 = new AdvancedModelRenderer(this);
        this.tentacleB24.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle24.addChild(tentacleB24);
        this.tentacleB24.cubeList.add(new ModelBox(tentacleB24, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC24 = new AdvancedModelRenderer(this);
        this.tentacleC24.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB24.addChild(tentacleC24);
        this.tentacleC24.cubeList.add(new ModelBox(tentacleC24, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD24 = new AdvancedModelRenderer(this);
        this.tentacleD24.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC24.addChild(tentacleD24);
        this.tentacleD24.cubeList.add(new ModelBox(tentacleD24, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle25 = new AdvancedModelRenderer(this);
        this.tentacle25.setRotationPoint(-3.0F, -9.0F, 4.0F);
        this.body.addChild(tentacle25);
        this.setRotateAngle(tentacle25, 0.0F, 0.7854F, 0.0F);
        this.tentacle25.cubeList.add(new ModelBox(tentacle25, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB25 = new AdvancedModelRenderer(this);
        this.tentacleB25.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle25.addChild(tentacleB25);
        this.tentacleB25.cubeList.add(new ModelBox(tentacleB25, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC25 = new AdvancedModelRenderer(this);
        this.tentacleC25.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB25.addChild(tentacleC25);
        this.tentacleC25.cubeList.add(new ModelBox(tentacleC25, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD25 = new AdvancedModelRenderer(this);
        this.tentacleD25.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC25.addChild(tentacleD25);
        this.tentacleD25.cubeList.add(new ModelBox(tentacleD25, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle26 = new AdvancedModelRenderer(this);
        this.tentacle26.setRotationPoint(4.0F, -9.0F, 4.0F);
        this.body.addChild(tentacle26);
        this.setRotateAngle(tentacle26, 0.0F, 0.7854F, 0.0F);
        this.tentacle26.cubeList.add(new ModelBox(tentacle26, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB26 = new AdvancedModelRenderer(this);
        this.tentacleB26.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle26.addChild(tentacleB26);
        this.tentacleB26.cubeList.add(new ModelBox(tentacleB26, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC26 = new AdvancedModelRenderer(this);
        this.tentacleC26.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB26.addChild(tentacleC26);
        this.tentacleC26.cubeList.add(new ModelBox(tentacleC26, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD26 = new AdvancedModelRenderer(this);
        this.tentacleD26.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC26.addChild(tentacleD26);
        this.tentacleD26.cubeList.add(new ModelBox(tentacleD26, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle27 = new AdvancedModelRenderer(this);
        this.tentacle27.setRotationPoint(4.0F, -9.0F, -3.0F);
        this.body.addChild(tentacle27);
        this.setRotateAngle(tentacle27, 0.0F, 0.7854F, 0.0F);
        this.tentacle27.cubeList.add(new ModelBox(tentacle27, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB27 = new AdvancedModelRenderer(this);
        this.tentacleB27.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle27.addChild(tentacleB27);
        this.tentacleB27.cubeList.add(new ModelBox(tentacleB27, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC27 = new AdvancedModelRenderer(this);
        this.tentacleC27.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB27.addChild(tentacleC27);
        this.tentacleC27.cubeList.add(new ModelBox(tentacleC27, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD27 = new AdvancedModelRenderer(this);
        this.tentacleD27.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC27.addChild(tentacleD27);
        this.tentacleD27.cubeList.add(new ModelBox(tentacleD27, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle28 = new AdvancedModelRenderer(this);
        this.tentacle28.setRotationPoint(-3.0F, -9.0F, -3.0F);
        this.body.addChild(tentacle28);
        this.setRotateAngle(tentacle28, 0.0F, 0.7854F, 0.0F);
        this.tentacle28.cubeList.add(new ModelBox(tentacle28, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB28 = new AdvancedModelRenderer(this);
        this.tentacleB28.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle28.addChild(tentacleB28);
        this.tentacleB28.cubeList.add(new ModelBox(tentacleB28, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this. tentacleC28 = new AdvancedModelRenderer(this);
        this.tentacleC28.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB28.addChild(tentacleC28);
        this.tentacleC28.cubeList.add(new ModelBox(tentacleC28, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD28 = new AdvancedModelRenderer(this);
        this.tentacleD28.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC28.addChild(tentacleD28);
        this.tentacleD28.cubeList.add(new ModelBox(tentacleD28, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle29 = new AdvancedModelRenderer(this);
        this.tentacle29.setRotationPoint(-4.0F, -9.0F, -4.0F);
        this.body.addChild(tentacle29);
        this.setRotateAngle(tentacle29, 0.0F, 0.7854F, 0.0F);
        this.tentacle29.cubeList.add(new ModelBox(tentacle29, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB29 = new AdvancedModelRenderer(this);
        this.tentacleB29.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle29.addChild(tentacleB29);
        this.tentacleB29.cubeList.add(new ModelBox(tentacleB29, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC29 = new AdvancedModelRenderer(this);
        this.tentacleC29.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB29.addChild(tentacleC29);
        this.tentacleC29.cubeList.add(new ModelBox(tentacleC29, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD29 = new AdvancedModelRenderer(this);
        this.tentacleD29.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC29.addChild(tentacleD29);
        this.tentacleD29.cubeList.add(new ModelBox(tentacleD29, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle30 = new AdvancedModelRenderer(this);
        this.tentacle30.setRotationPoint(-4.0F, -9.0F, 3.0F);
        this.body.addChild(tentacle30);
        this.setRotateAngle(tentacle30, 0.0F, 0.7854F, 0.0F);
        this.tentacle30.cubeList.add(new ModelBox(tentacle30, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this. tentacleB30 = new AdvancedModelRenderer(this);
        this.tentacleB30.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle30.addChild(tentacleB30);
        this.tentacleB30.cubeList.add(new ModelBox(tentacleB30, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC30 = new AdvancedModelRenderer(this);
        this.tentacleC30.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB30.addChild(tentacleC30);
        this.tentacleC30.cubeList.add(new ModelBox(tentacleC30, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD30 = new AdvancedModelRenderer(this);
        this.tentacleD30.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC30.addChild(tentacleD30);
        this.tentacleD30.cubeList.add(new ModelBox(tentacleD30, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle31 = new AdvancedModelRenderer(this);
        this.tentacle31.setRotationPoint(3.0F, -9.0F, 3.0F);
        this.body.addChild(tentacle31);
        this.setRotateAngle(tentacle31, 0.0F, 0.7854F, 0.0F);
        this.tentacle31.cubeList.add(new ModelBox(tentacle31, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB31 = new AdvancedModelRenderer(this);
        this.tentacleB31.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle31.addChild(tentacleB31);
        this.tentacleB31.cubeList.add(new ModelBox(tentacleB31, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC31 = new AdvancedModelRenderer(this);
        this.tentacleC31.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB31.addChild(tentacleC31);
        this.tentacleC31.cubeList.add(new ModelBox(tentacleC31, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD31 = new AdvancedModelRenderer(this);
        this.tentacleD31.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC31.addChild(tentacleD31);
        this.tentacleD31.cubeList.add(new ModelBox(tentacleD31, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacle32 = new AdvancedModelRenderer(this);
        this.tentacle32.setRotationPoint(3.0F, -9.0F, -4.0F);
        this.body.addChild(tentacle32);
        this.setRotateAngle(tentacle32, 0.0F, 0.7854F, 0.0F);
        this.tentacle32.cubeList.add(new ModelBox(tentacle32, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleB32 = new AdvancedModelRenderer(this);
        this.tentacleB32.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacle32.addChild(tentacleB32);
        this.tentacleB32.cubeList.add(new ModelBox(tentacleB32, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleC32 = new AdvancedModelRenderer(this);
        this.tentacleC32.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleB32.addChild(tentacleC32);
        this.tentacleC32.cubeList.add(new ModelBox(tentacleC32, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.tentacleD32 = new AdvancedModelRenderer(this);
        this.tentacleD32.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.tentacleC32.addChild(tentacleD32);
        this.tentacleD32.cubeList.add(new ModelBox(tentacleD32, 1, 23, -0.5F, 0.0F, 0.0F, 1, 3, 0, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);

        this.body.render(f5 * 0.45F);
        GlStateManager.disableBlend();
    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        this.body.offsetY = 1.1F;
        this.body.setScaleX(1.0F);
        this.body.setScaleZ(1.0F);
        this.body.scaleChildren = false;
        AdvancedModelRenderer[] tentacle1 = {this.tentacle,this.tentacleB,this.tentacleC,this.tentacleD};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2,this.tentacleB2,this.tentacleC2,this.tentacleD2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3,this.tentacleB3,this.tentacleC3,this.tentacleD3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4,this.tentacleB4,this.tentacleC4,this.tentacleD4};
        AdvancedModelRenderer[] tentacle5 = {this.tentacle5,this.tentacleB5,this.tentacleC5,this.tentacleD5};
        AdvancedModelRenderer[] tentacle6 = {this.tentacle6,this.tentacleB6,this.tentacleC6,this.tentacleD6};
        AdvancedModelRenderer[] tentacle7 = {this.tentacle7,this.tentacleB7,this.tentacleC7,this.tentacleD7};
        AdvancedModelRenderer[] tentacle8 = {this.tentacle8,this.tentacleB8,this.tentacleC8,this.tentacleD8};
        AdvancedModelRenderer[] tentacle9 = {this.tentacle9,this.tentacleB9,this.tentacleC9,this.tentacleD9};
        AdvancedModelRenderer[] tentacle10 = {this.tentacle10,this.tentacleB10,this.tentacleC10,this.tentacleD10};
        AdvancedModelRenderer[] tentacle11 = {this.tentacle11,this.tentacleB11,this.tentacleC11,this.tentacleD11};
        AdvancedModelRenderer[] tentacle12 = {this.tentacle12,this.tentacleB12,this.tentacleC12,this.tentacleD12};
        AdvancedModelRenderer[] tentacle13 = {this.tentacle13,this.tentacleB13,this.tentacleC13,this.tentacleD13};
        AdvancedModelRenderer[] tentacle14 = {this.tentacle14,this.tentacleB14,this.tentacleC14,this.tentacleD14};
        AdvancedModelRenderer[] tentacle15 = {this.tentacle15,this.tentacleB15,this.tentacleC15,this.tentacleD15};
        AdvancedModelRenderer[] tentacle16 = {this.tentacle16,this.tentacleB16,this.tentacleC16,this.tentacleD16};
        AdvancedModelRenderer[] tentacle17 = {this.tentacle17,this.tentacleB17,this.tentacleC17,this.tentacleD17};
        AdvancedModelRenderer[] tentacle18 = {this.tentacle18,this.tentacleB18,this.tentacleC18,this.tentacleD18};
        AdvancedModelRenderer[] tentacle19 = {this.tentacle19,this.tentacleB19,this.tentacleC19,this.tentacleD19};
        AdvancedModelRenderer[] tentacle20 = {this.tentacle20,this.tentacleB20,this.tentacleC20,this.tentacleD20};
        AdvancedModelRenderer[] tentacle21 = {this.tentacle21,this.tentacleB21,this.tentacleC21,this.tentacleD21};
        AdvancedModelRenderer[] tentacle22 = {this.tentacle22,this.tentacleB22,this.tentacleC22,this.tentacleD22};
        AdvancedModelRenderer[] tentacle23 = {this.tentacle23,this.tentacleB23,this.tentacleC23,this.tentacleD23};
        AdvancedModelRenderer[] tentacle24 = {this.tentacle24,this.tentacleB24,this.tentacleC24,this.tentacleD24};
        AdvancedModelRenderer[] tentacle25 = {this.tentacle25,this.tentacleB25,this.tentacleC25,this.tentacleD25};
        AdvancedModelRenderer[] tentacle26 = {this.tentacle26,this.tentacleB26,this.tentacleC26,this.tentacleD26};
        AdvancedModelRenderer[] tentacle27 = {this.tentacle27,this.tentacleB27,this.tentacleC27,this.tentacleD27};
        AdvancedModelRenderer[] tentacle28 = {this.tentacle28,this.tentacleB28,this.tentacleC28,this.tentacleD28};
        AdvancedModelRenderer[] tentacle29 = {this.tentacle29,this.tentacleB29,this.tentacleC29,this.tentacleD29};
        AdvancedModelRenderer[] tentacle30 = {this.tentacle30,this.tentacleB30,this.tentacleC30,this.tentacleD30};
        AdvancedModelRenderer[] tentacle31 = {this.tentacle31,this.tentacleB31,this.tentacleC31,this.tentacleD31};
        AdvancedModelRenderer[] tentacle32 = {this.tentacle32,this.tentacleB32,this.tentacleC32,this.tentacleD32};

        float speed = 0.125F;
        if (!e.isInWater()) {
            speed = 0.0F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(body, speed * 0.4F, 0.5F, true, 0, 0, f2, 1);
            this.walk(body, speed * 0.3F, 0.8F, true, 0, 0, f2, 1);
            this.flap(body, speed * 0.2F, 0.8F, true, 0, 0, f2, 1);
            this.chainWave(tentacle1, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle2, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle3, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle4, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle5, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle6, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle7, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle8, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle9, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle10, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle11, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle12, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle13, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle14, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle15, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle16, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle17, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle18, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle19, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle20, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle21, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle22, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle23, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle24, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle25, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle26, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle27, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle28, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle29, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle30, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle31, speed, -0.4F, -3, f2, 1);
            this.chainWave(tentacle32, speed, -0.4F, -3, f2, 1);

            this.bob(body, -speed * 0.5F, 1F, false, f2, 1);

            if (!e.isInWater()) {
                this.resetToDefaultPose();
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.6F;
                this.body.offsetX = -0.7F;
                this.body.offsetZ = -0.3F;
                this.body.scaleChildren = true;
                this.body.setScaleX(0.2F);
                this.body.setScaleZ(1.2F);
            }
        }
    }
}
