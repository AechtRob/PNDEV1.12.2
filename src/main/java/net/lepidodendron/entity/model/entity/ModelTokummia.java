package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTokummia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer lowerbody1;
    private final AdvancedModelRenderer lowerbody2;
    private final AdvancedModelRenderer lowerbody3;
    private final AdvancedModelRenderer lowerbody4;
    private final AdvancedModelRenderer lowerbody5;
    private final AdvancedModelRenderer legtypeER3;
    private final AdvancedModelRenderer legtypeER4;
    private final AdvancedModelRenderer legtypeER5;
    private final AdvancedModelRenderer legtypeER6;
    private final AdvancedModelRenderer legtypeEL3;
    private final AdvancedModelRenderer legtypeEL4;
    private final AdvancedModelRenderer legtypeEL5;
    private final AdvancedModelRenderer legtypeEL6;
    private final AdvancedModelRenderer legtypeER1;
    private final AdvancedModelRenderer legtypeER2;
    private final AdvancedModelRenderer legtypeEL1;
    private final AdvancedModelRenderer legtypeEL2;
    private final AdvancedModelRenderer legtypeDL5;
    private final AdvancedModelRenderer legtypeDL6;
    private final AdvancedModelRenderer legtypeDR5;
    private final AdvancedModelRenderer legtypeDR6;
    private final AdvancedModelRenderer legtypeDR1;
    private final AdvancedModelRenderer legtypeDR2;
    private final AdvancedModelRenderer legtypeDR3;
    private final AdvancedModelRenderer legtypeDR4;
    private final AdvancedModelRenderer legtypeDL1;
    private final AdvancedModelRenderer legtypeDL2;
    private final AdvancedModelRenderer legtypeDL3;
    private final AdvancedModelRenderer legtypeDL4;
    private final AdvancedModelRenderer legtypeCL5;
    private final AdvancedModelRenderer legtypeCL7;
    private final AdvancedModelRenderer legtypeCL8;
    private final AdvancedModelRenderer legtypeCL6;
    private final AdvancedModelRenderer legtypeCR5;
    private final AdvancedModelRenderer legtypeCR6;
    private final AdvancedModelRenderer legtypeCR7;
    private final AdvancedModelRenderer legtypeCR8;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legtypeCL1;
    private final AdvancedModelRenderer legtypeCL2;
    private final AdvancedModelRenderer legtypeCL3;
    private final AdvancedModelRenderer legtypeCL4;
    private final AdvancedModelRenderer legtypeCR1;
    private final AdvancedModelRenderer legtypeCR2;
    private final AdvancedModelRenderer legtypeCR3;
    private final AdvancedModelRenderer legtypeCR4;
    private final AdvancedModelRenderer legtypeBL1;
    private final AdvancedModelRenderer legtypeBL2;
    private final AdvancedModelRenderer legtypeBL3;
    private final AdvancedModelRenderer legtypeBL4;
    private final AdvancedModelRenderer legtypeBL5;
    private final AdvancedModelRenderer legtypeBL6;
    private final AdvancedModelRenderer legtypeBR1;
    private final AdvancedModelRenderer legtypeBR2;
    private final AdvancedModelRenderer legtypeBR3;
    private final AdvancedModelRenderer legtypeBR4;
    private final AdvancedModelRenderer legtypeBR5;
    private final AdvancedModelRenderer legtypeBR6;
    private final AdvancedModelRenderer appendageR;
    private final AdvancedModelRenderer legtypeAL1;
    private final AdvancedModelRenderer legtypeAL2;
    private final AdvancedModelRenderer legtypeAL3;
    private final AdvancedModelRenderer legtypeAL4;
    private final AdvancedModelRenderer legtypeAL5;
    private final AdvancedModelRenderer legtypeAL6;
    private final AdvancedModelRenderer legtypeAL7;
    private final AdvancedModelRenderer legtypeAL8;
    private final AdvancedModelRenderer legtypeAR1;
    private final AdvancedModelRenderer legtypeAR2;
    private final AdvancedModelRenderer legtypeAR3;
    private final AdvancedModelRenderer legtypeAR4;
    private final AdvancedModelRenderer legtypeAR5;
    private final AdvancedModelRenderer legtypeAR6;
    private final AdvancedModelRenderer legtypeAR7;
    private final AdvancedModelRenderer legtypeAR8;
    private final AdvancedModelRenderer appendageL;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;

    public ModelTokummia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 44, -4.5F, -7.25F, -4.75F, 9, 6, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 0, -0.5F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 8, -0.5F, -6.5F, -4.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 19, -1.49F, -7.0F, -3.0F, 3, 2, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 31, -1.0F, -7.0F, -4.0F, 2, 1, 1, 0.0F, false));

        this.lowerbody1 = new AdvancedModelRenderer(this);
        this.lowerbody1.setRotationPoint(0.0F, -6.75F, 7.0F);
        this.body.addChild(lowerbody1);
        this.setRotateAngle(lowerbody1, -0.0873F, 0.0F, 0.0F);
        this.lowerbody1.cubeList.add(new ModelBox(lowerbody1, 28, 27, -1.5F, -0.26F, 0.0F, 3, 2, 2, 0.0F, false));

        this.lowerbody2 = new AdvancedModelRenderer(this);
        this.lowerbody2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lowerbody1.addChild(lowerbody2);
        this.setRotateAngle(lowerbody2, 0.1309F, 0.0F, 0.0F);
        this.lowerbody2.cubeList.add(new ModelBox(lowerbody2, 0, 23, -1.49F, -0.25F, 0.0F, 3, 2, 2, 0.0F, false));

        this.lowerbody3 = new AdvancedModelRenderer(this);
        this.lowerbody3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lowerbody2.addChild(lowerbody3);
        this.setRotateAngle(lowerbody3, -0.0873F, 0.0F, 0.0F);
        this.lowerbody3.cubeList.add(new ModelBox(lowerbody3, 0, 19, -1.5F, -0.26F, 0.0F, 3, 2, 2, 0.0F, false));

        this.lowerbody4 = new AdvancedModelRenderer(this);
        this.lowerbody4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lowerbody3.addChild(lowerbody4);
        this.setRotateAngle(lowerbody4, -0.0873F, 0.0F, 0.0F);
        this.lowerbody4.cubeList.add(new ModelBox(lowerbody4, 0, 9, -1.49F, -0.25F, 0.0F, 3, 2, 2, 0.0F, false));

        this.lowerbody5 = new AdvancedModelRenderer(this);
        this.lowerbody5.setRotationPoint(0.0F, 0.25F, 1.5F);
        this.lowerbody4.addChild(lowerbody5);
        this.setRotateAngle(lowerbody5, -0.0873F, 0.0F, 0.0F);
        this.lowerbody5.cubeList.add(new ModelBox(lowerbody5, 30, 19, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.lowerbody5.cubeList.add(new ModelBox(lowerbody5, 0, 0, -1.5F, 0.5F, 1.5F, 3, 0, 3, 0.0F, false));

        this.legtypeER3 = new AdvancedModelRenderer(this);
        this.legtypeER3.setRotationPoint(-0.75F, 1.75F, 0.5F);
        this.lowerbody4.addChild(legtypeER3);
        this.legtypeER3.cubeList.add(new ModelBox(legtypeER3, 30, 26, -2.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeER4 = new AdvancedModelRenderer(this);
        this.legtypeER4.setRotationPoint(-0.75F, 1.75F, 1.0F);
        this.lowerbody4.addChild(legtypeER4);
        this.legtypeER4.cubeList.add(new ModelBox(legtypeER4, 30, 26, -2.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeER5 = new AdvancedModelRenderer(this);
        this.legtypeER5.setRotationPoint(-0.75F, 1.75F, 1.5F);
        this.lowerbody4.addChild(legtypeER5);
        this.legtypeER5.cubeList.add(new ModelBox(legtypeER5, 30, 26, -2.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeER6 = new AdvancedModelRenderer(this);
        this.legtypeER6.setRotationPoint(-0.75F, 1.75F, 2.0F);
        this.lowerbody4.addChild(legtypeER6);
        this.legtypeER6.cubeList.add(new ModelBox(legtypeER6, 30, 26, -2.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeEL3 = new AdvancedModelRenderer(this);
        this.legtypeEL3.setRotationPoint(0.75F, 1.75F, 0.5F);
        this.lowerbody4.addChild(legtypeEL3);
        this.legtypeEL3.cubeList.add(new ModelBox(legtypeEL3, 17, 31, -0.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeEL4 = new AdvancedModelRenderer(this);
        this.legtypeEL4.setRotationPoint(0.75F, 1.75F, 1.0F);
        this.lowerbody4.addChild(legtypeEL4);
        this.legtypeEL4.cubeList.add(new ModelBox(legtypeEL4, 17, 31, -0.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeEL5 = new AdvancedModelRenderer(this);
        this.legtypeEL5.setRotationPoint(0.75F, 1.75F, 1.5F);
        this.lowerbody4.addChild(legtypeEL5);
        this.legtypeEL5.cubeList.add(new ModelBox(legtypeEL5, 17, 31, -0.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeEL6 = new AdvancedModelRenderer(this);
        this.legtypeEL6.setRotationPoint(0.75F, 1.75F, 2.0F);
        this.lowerbody4.addChild(legtypeEL6);
        this.legtypeEL6.cubeList.add(new ModelBox(legtypeEL6, 17, 31, -0.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeER1 = new AdvancedModelRenderer(this);
        this.legtypeER1.setRotationPoint(-0.75F, 1.75F, 1.5F);
        this.lowerbody3.addChild(legtypeER1);
        this.legtypeER1.cubeList.add(new ModelBox(legtypeER1, 30, 26, -2.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeER2 = new AdvancedModelRenderer(this);
        this.legtypeER2.setRotationPoint(-0.75F, 1.75F, 2.0F);
        this.lowerbody3.addChild(legtypeER2);
        this.legtypeER2.cubeList.add(new ModelBox(legtypeER2, 30, 26, -2.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeEL1 = new AdvancedModelRenderer(this);
        this.legtypeEL1.setRotationPoint(0.75F, 1.75F, 1.5F);
        this.lowerbody3.addChild(legtypeEL1);
        this.legtypeEL1.cubeList.add(new ModelBox(legtypeEL1, 17, 31, -0.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeEL2 = new AdvancedModelRenderer(this);
        this.legtypeEL2.setRotationPoint(0.75F, 1.75F, 2.0F);
        this.lowerbody3.addChild(legtypeEL2);
        this.legtypeEL2.cubeList.add(new ModelBox(legtypeEL2, 17, 31, -0.5F, 0.0F, 0.0F, 3, 1, 0, 0.0F, false));

        this.legtypeDL5 = new AdvancedModelRenderer(this);
        this.legtypeDL5.setRotationPoint(0.75F, 1.75F, 0.5F);
        this.lowerbody3.addChild(legtypeDL5);
        this.legtypeDL5.cubeList.add(new ModelBox(legtypeDL5, 31, 11, -0.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDL6 = new AdvancedModelRenderer(this);
        this.legtypeDL6.setRotationPoint(0.75F, 1.75F, 1.0F);
        this.lowerbody3.addChild(legtypeDL6);
        this.legtypeDL6.cubeList.add(new ModelBox(legtypeDL6, 31, 11, -0.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDR5 = new AdvancedModelRenderer(this);
        this.legtypeDR5.setRotationPoint(-0.75F, 1.75F, 0.5F);
        this.lowerbody3.addChild(legtypeDR5);
        this.legtypeDR5.cubeList.add(new ModelBox(legtypeDR5, 0, 27, -2.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDR6 = new AdvancedModelRenderer(this);
        this.legtypeDR6.setRotationPoint(-0.75F, 1.75F, 1.0F);
        this.lowerbody3.addChild(legtypeDR6);
        this.legtypeDR6.cubeList.add(new ModelBox(legtypeDR6, 0, 27, -2.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDR1 = new AdvancedModelRenderer(this);
        this.legtypeDR1.setRotationPoint(-0.75F, 1.75F, 0.5F);
        this.lowerbody2.addChild(legtypeDR1);
        this.legtypeDR1.cubeList.add(new ModelBox(legtypeDR1, 0, 27, -2.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDR2 = new AdvancedModelRenderer(this);
        this.legtypeDR2.setRotationPoint(-0.75F, 1.75F, 1.0F);
        this.lowerbody2.addChild(legtypeDR2);
        this.legtypeDR2.cubeList.add(new ModelBox(legtypeDR2, 0, 27, -2.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDR3 = new AdvancedModelRenderer(this);
        this.legtypeDR3.setRotationPoint(-0.75F, 1.75F, 1.5F);
        this.lowerbody2.addChild(legtypeDR3);
        this.legtypeDR3.cubeList.add(new ModelBox(legtypeDR3, 0, 27, -2.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDR4 = new AdvancedModelRenderer(this);
        this.legtypeDR4.setRotationPoint(-0.75F, 1.75F, 2.0F);
        this.lowerbody2.addChild(legtypeDR4);
        this.legtypeDR4.cubeList.add(new ModelBox(legtypeDR4, 0, 27, -2.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDL1 = new AdvancedModelRenderer(this);
        this.legtypeDL1.setRotationPoint(0.75F, 1.75F, 0.5F);
        this.lowerbody2.addChild(legtypeDL1);
        this.legtypeDL1.cubeList.add(new ModelBox(legtypeDL1, 31, 11, -0.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDL2 = new AdvancedModelRenderer(this);
        this.legtypeDL2.setRotationPoint(0.75F, 1.75F, 1.0F);
        this.lowerbody2.addChild(legtypeDL2);
        this.legtypeDL2.cubeList.add(new ModelBox(legtypeDL2, 31, 11, -0.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDL3 = new AdvancedModelRenderer(this);
        this.legtypeDL3.setRotationPoint(0.75F, 1.75F, 1.5F);
        this.lowerbody2.addChild(legtypeDL3);
        this.legtypeDL3.cubeList.add(new ModelBox(legtypeDL3, 31, 11, -0.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeDL4 = new AdvancedModelRenderer(this);
        this.legtypeDL4.setRotationPoint(0.75F, 1.75F, 2.0F);
        this.lowerbody2.addChild(legtypeDL4);
        this.legtypeDL4.cubeList.add(new ModelBox(legtypeDL4, 31, 11, -0.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legtypeCL5 = new AdvancedModelRenderer(this);
        this.legtypeCL5.setRotationPoint(0.75F, 1.75F, 0.5F);
        this.lowerbody1.addChild(legtypeCL5);
        this.legtypeCL5.cubeList.add(new ModelBox(legtypeCL5, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCL7 = new AdvancedModelRenderer(this);
        this.legtypeCL7.setRotationPoint(0.75F, 1.75F, 1.5F);
        this.lowerbody1.addChild(legtypeCL7);
        this.legtypeCL7.cubeList.add(new ModelBox(legtypeCL7, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCL8 = new AdvancedModelRenderer(this);
        this.legtypeCL8.setRotationPoint(0.75F, 1.75F, 2.0F);
        this.lowerbody1.addChild(legtypeCL8);
        this.legtypeCL8.cubeList.add(new ModelBox(legtypeCL8, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCL6 = new AdvancedModelRenderer(this);
        this.legtypeCL6.setRotationPoint(0.75F, 1.75F, 1.0F);
        this.lowerbody1.addChild(legtypeCL6);
        this.legtypeCL6.cubeList.add(new ModelBox(legtypeCL6, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR5 = new AdvancedModelRenderer(this);
        this.legtypeCR5.setRotationPoint(-0.75F, 1.75F, 0.5F);
        this.lowerbody1.addChild(legtypeCR5);
        this.legtypeCR5.cubeList.add(new ModelBox(legtypeCR5, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR6 = new AdvancedModelRenderer(this);
        this.legtypeCR6.setRotationPoint(-0.75F, 1.75F, 1.0F);
        this.lowerbody1.addChild(legtypeCR6);
        this.legtypeCR6.cubeList.add(new ModelBox(legtypeCR6, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR7 = new AdvancedModelRenderer(this);
        this.legtypeCR7.setRotationPoint(-0.75F, 1.75F, 1.5F);
        this.lowerbody1.addChild(legtypeCR7);
        this.legtypeCR7.cubeList.add(new ModelBox(legtypeCR7, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR8 = new AdvancedModelRenderer(this);
        this.legtypeCR8.setRotationPoint(-0.75F, 1.75F, 2.0F);
        this.lowerbody1.addChild(legtypeCR8);
        this.legtypeCR8.cubeList.add(new ModelBox(legtypeCR8, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -5.0F, -2.75F);
        this.body.addChild(legR1);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 0, -0.25F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -5.0F, -2.5F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 0, -0.25F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legtypeCL1 = new AdvancedModelRenderer(this);
        this.legtypeCL1.setRotationPoint(0.75F, -5.0F, 5.5F);
        this.body.addChild(legtypeCL1);
        this.legtypeCL1.cubeList.add(new ModelBox(legtypeCL1, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCL2 = new AdvancedModelRenderer(this);
        this.legtypeCL2.setRotationPoint(0.75F, -5.0F, 6.0F);
        this.body.addChild(legtypeCL2);
        this.legtypeCL2.cubeList.add(new ModelBox(legtypeCL2, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCL3 = new AdvancedModelRenderer(this);
        this.legtypeCL3.setRotationPoint(0.75F, -5.0F, 6.5F);
        this.body.addChild(legtypeCL3);
        this.legtypeCL3.cubeList.add(new ModelBox(legtypeCL3, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCL4 = new AdvancedModelRenderer(this);
        this.legtypeCL4.setRotationPoint(0.75F, -5.0F, 7.0F);
        this.body.addChild(legtypeCL4);
        this.legtypeCL4.cubeList.add(new ModelBox(legtypeCL4, 31, 8, -0.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR1 = new AdvancedModelRenderer(this);
        this.legtypeCR1.setRotationPoint(-0.75F, -5.0F, 5.5F);
        this.body.addChild(legtypeCR1);
        this.legtypeCR1.cubeList.add(new ModelBox(legtypeCR1, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR2 = new AdvancedModelRenderer(this);
        this.legtypeCR2.setRotationPoint(-0.75F, -5.0F, 6.0F);
        this.body.addChild(legtypeCR2);
        this.legtypeCR2.cubeList.add(new ModelBox(legtypeCR2, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR3 = new AdvancedModelRenderer(this);
        this.legtypeCR3.setRotationPoint(-0.75F, -5.0F, 6.5F);
        this.body.addChild(legtypeCR3);
        this.legtypeCR3.cubeList.add(new ModelBox(legtypeCR3, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeCR4 = new AdvancedModelRenderer(this);
        this.legtypeCR4.setRotationPoint(-0.75F, -5.0F, 7.0F);
        this.body.addChild(legtypeCR4);
        this.legtypeCR4.cubeList.add(new ModelBox(legtypeCR4, 6, 31, -2.5F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legtypeBL1 = new AdvancedModelRenderer(this);
        this.legtypeBL1.setRotationPoint(0.75F, -5.0F, 2.5F);
        this.body.addChild(legtypeBL1);
        this.legtypeBL1.cubeList.add(new ModelBox(legtypeBL1, 31, 0, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBL2 = new AdvancedModelRenderer(this);
        this.legtypeBL2.setRotationPoint(0.75F, -5.0F, 3.0F);
        this.body.addChild(legtypeBL2);
        this.legtypeBL2.cubeList.add(new ModelBox(legtypeBL2, 31, 0, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBL3 = new AdvancedModelRenderer(this);
        this.legtypeBL3.setRotationPoint(0.75F, -5.0F, 3.5F);
        this.body.addChild(legtypeBL3);
        this.legtypeBL3.cubeList.add(new ModelBox(legtypeBL3, 31, 0, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBL4 = new AdvancedModelRenderer(this);
        this.legtypeBL4.setRotationPoint(0.75F, -5.0F, 4.0F);
        this.body.addChild(legtypeBL4);
        this.legtypeBL4.cubeList.add(new ModelBox(legtypeBL4, 31, 0, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBL5 = new AdvancedModelRenderer(this);
        this.legtypeBL5.setRotationPoint(0.75F, -5.0F, 4.5F);
        this.body.addChild(legtypeBL5);
        this.legtypeBL5.cubeList.add(new ModelBox(legtypeBL5, 31, 0, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBL6 = new AdvancedModelRenderer(this);
        this.legtypeBL6.setRotationPoint(0.75F, -5.0F, 5.0F);
        this.body.addChild(legtypeBL6);
        this.legtypeBL6.cubeList.add(new ModelBox(legtypeBL6, 31, 0, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBR1 = new AdvancedModelRenderer(this);
        this.legtypeBR1.setRotationPoint(-0.75F, -5.0F, 2.5F);
        this.body.addChild(legtypeBR1);
        this.legtypeBR1.cubeList.add(new ModelBox(legtypeBR1, 30, 22, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBR2 = new AdvancedModelRenderer(this);
        this.legtypeBR2.setRotationPoint(-0.75F, -5.0F, 3.0F);
        this.body.addChild(legtypeBR2);
        this.legtypeBR2.cubeList.add(new ModelBox(legtypeBR2, 30, 22, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBR3 = new AdvancedModelRenderer(this);
        this.legtypeBR3.setRotationPoint(-0.75F, -5.0F, 3.5F);
        this.body.addChild(legtypeBR3);
        this.legtypeBR3.cubeList.add(new ModelBox(legtypeBR3, 30, 22, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBR4 = new AdvancedModelRenderer(this);
        this.legtypeBR4.setRotationPoint(-0.75F, -5.0F, 4.0F);
        this.body.addChild(legtypeBR4);
        this.legtypeBR4.cubeList.add(new ModelBox(legtypeBR4, 30, 22, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBR5 = new AdvancedModelRenderer(this);
        this.legtypeBR5.setRotationPoint(-0.75F, -5.0F, 4.5F);
        this.body.addChild(legtypeBR5);
        this.legtypeBR5.cubeList.add(new ModelBox(legtypeBR5, 30, 22, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeBR6 = new AdvancedModelRenderer(this);
        this.legtypeBR6.setRotationPoint(-0.75F, -5.0F, 5.0F);
        this.body.addChild(legtypeBR6);
        this.legtypeBR6.cubeList.add(new ModelBox(legtypeBR6, 30, 22, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.appendageR = new AdvancedModelRenderer(this);
        this.appendageR.setRotationPoint(-1.0F, -5.0F, -2.25F);
        this.body.addChild(appendageR);
        this.setRotateAngle(appendageR, 0.0F, 0.3491F, 0.6981F);
        this.appendageR.cubeList.add(new ModelBox(appendageR, 16, 12, 0.0F, 0.0F, -6.5F, 0, 5, 7, 0.0F, false));

        this.legtypeAL1 = new AdvancedModelRenderer(this);
        this.legtypeAL1.setRotationPoint(0.75F, -5.0F, -1.5F);
        this.body.addChild(legtypeAL1);
        this.legtypeAL1.cubeList.add(new ModelBox(legtypeAL1, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL2 = new AdvancedModelRenderer(this);
        this.legtypeAL2.setRotationPoint(0.75F, -5.0F, -1.0F);
        this.body.addChild(legtypeAL2);
        this.legtypeAL2.cubeList.add(new ModelBox(legtypeAL2, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL3 = new AdvancedModelRenderer(this);
        this.legtypeAL3.setRotationPoint(0.75F, -5.0F, -0.5F);
        this.body.addChild(legtypeAL3);
        this.legtypeAL3.cubeList.add(new ModelBox(legtypeAL3, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL4 = new AdvancedModelRenderer(this);
        this.legtypeAL4.setRotationPoint(0.75F, -5.0F, 0.0F);
        this.body.addChild(legtypeAL4);
        this.legtypeAL4.cubeList.add(new ModelBox(legtypeAL4, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL5 = new AdvancedModelRenderer(this);
        this.legtypeAL5.setRotationPoint(0.75F, -5.0F, 0.5F);
        this.body.addChild(legtypeAL5);
        this.legtypeAL5.cubeList.add(new ModelBox(legtypeAL5, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL6 = new AdvancedModelRenderer(this);
        this.legtypeAL6.setRotationPoint(0.75F, -5.0F, 1.0F);
        this.body.addChild(legtypeAL6);
        this.legtypeAL6.cubeList.add(new ModelBox(legtypeAL6, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL7 = new AdvancedModelRenderer(this);
        this.legtypeAL7.setRotationPoint(0.75F, -5.0F, 1.5F);
        this.body.addChild(legtypeAL7);
        this.legtypeAL7.cubeList.add(new ModelBox(legtypeAL7, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAL8 = new AdvancedModelRenderer(this);
        this.legtypeAL8.setRotationPoint(0.75F, -5.0F, 2.0F);
        this.body.addChild(legtypeAL8);
        this.legtypeAL8.cubeList.add(new ModelBox(legtypeAL8, 31, 4, -0.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR1 = new AdvancedModelRenderer(this);
        this.legtypeAR1.setRotationPoint(-0.75F, -5.0F, -1.5F);
        this.body.addChild(legtypeAR1);
        this.legtypeAR1.cubeList.add(new ModelBox(legtypeAR1, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR2 = new AdvancedModelRenderer(this);
        this.legtypeAR2.setRotationPoint(-0.75F, -5.0F, -1.0F);
        this.body.addChild(legtypeAR2);
        this.legtypeAR2.cubeList.add(new ModelBox(legtypeAR2, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR3 = new AdvancedModelRenderer(this);
        this.legtypeAR3.setRotationPoint(-0.75F, -5.0F, -0.5F);
        this.body.addChild(legtypeAR3);
        this.legtypeAR3.cubeList.add(new ModelBox(legtypeAR3, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR4 = new AdvancedModelRenderer(this);
        this.legtypeAR4.setRotationPoint(-0.75F, -5.0F, 0.0F);
        this.body.addChild(legtypeAR4);
        this.legtypeAR4.cubeList.add(new ModelBox(legtypeAR4, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR5 = new AdvancedModelRenderer(this);
        this.legtypeAR5.setRotationPoint(-0.75F, -5.0F, 0.5F);
        this.body.addChild(legtypeAR5);
        this.legtypeAR5.cubeList.add(new ModelBox(legtypeAR5, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR6 = new AdvancedModelRenderer(this);
        this.legtypeAR6.setRotationPoint(-0.75F, -5.0F, 1.0F);
        this.body.addChild(legtypeAR6);
        this.legtypeAR6.cubeList.add(new ModelBox(legtypeAR6, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR7 = new AdvancedModelRenderer(this);
        this.legtypeAR7.setRotationPoint(-0.75F, -5.0F, 1.5F);
        this.body.addChild(legtypeAR7);
        this.legtypeAR7.cubeList.add(new ModelBox(legtypeAR7, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.legtypeAR8 = new AdvancedModelRenderer(this);
        this.legtypeAR8.setRotationPoint(-0.75F, -5.0F, 2.0F);
        this.body.addChild(legtypeAR8);
        this.legtypeAR8.cubeList.add(new ModelBox(legtypeAR8, 0, 31, -2.5F, 0.0F, 0.0F, 3, 4, 0, 0.0F, false));

        this.appendageL = new AdvancedModelRenderer(this);
        this.appendageL.setRotationPoint(1.0F, -5.0F, -2.25F);
        this.body.addChild(appendageL);
        this.setRotateAngle(appendageL, 0.0F, -0.3491F, -0.6981F);
        this.appendageL.cubeList.add(new ModelBox(appendageL, 16, 17, 0.0F, 0.0F, -6.5F, 0, 5, 7, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, -5.0F, -2.75F);
        this.body.addChild(legL1);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 2, -0.75F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -5.0F, -2.5F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 2, -0.75F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-1.0F, -6.5F, -3.25F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.0F, -0.5236F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 3, -3.0F, 0.0F, -2.75F, 3, 0, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(1.0F, -6.5F, -3.25F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, 0.0F, 0.5236F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 6, 0.0F, 0.0F, -2.75F, 3, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.25F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = -0.1F;
        this.body.render(0.017f);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.1F;

        AdvancedModelRenderer[] Tail = {this.lowerbody1, this.lowerbody2, this.lowerbody3, this.lowerbody4, this.lowerbody5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            this.swing(antennaL, 0.6F, -0.35F, false, 0, -0.1F, f2, 0.8F);
            this.swing(antennaR, 0.6F, 0.35F, false, 0, 0.1F, f2, 0.8F);

            if (f3 != 0) {
                this.swing(appendageL, 0.3F, -0.4F, false, 3, -0.1F, f2, 0.8F);
                this.swing(appendageR, 0.3F, 0.4F, false, 3, 0.1F, f2, 0.8F);
                this.walk(appendageL, 0.3F, 0.2F, false, 0, -0.2F, f2, 0.8F);
                this.walk(appendageR, 0.3F, 0.2F, false, 0, -0.2F, f2, 0.8F);
            }
            else {
                this.swing(appendageL, 0.12F, -0.25F, false, 3, -0.1F, f2, 0.8F);
                this.swing(appendageR, 0.12F, 0.25F, false, 3, 0.1F, f2, 0.8F);
                this.walk(appendageL, 0.12F, 0.12F, false, 1, -0.2F, f2, 0.8F);
                this.walk(appendageR, 0.12F, 0.12F, false, 1, -0.2F, f2, 0.8F);
            }

            float speedLeg = 1.5F;

            this.walk(legL1, speedLeg * 0.5F, -0.6F, false, 3, -0.4F, f2, 0.8F);
            this.walk(legR1, speedLeg * 0.5F, 0.6F, false, 3, 0.4F, f2, 0.8F);
            this.walk(legL2, speedLeg * 0.5F, -0.6F, false, 1, -0.4F, f2, 0.8F);
            this.walk(legR2, speedLeg * 0.5F, 0.6F, false, 1, 0.4F, f2, 0.8F);

            float degreeLeg = 0.3F;
            float weightLeg = -0.5F;
            this.flap(legtypeAL1, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR1, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
            this.flap(legtypeAL2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeAL3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeAL4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeAL5, speedLeg, -degreeLeg, false, 2.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR5, speedLeg, degreeLeg, false, 2.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeAL6, speedLeg, -degreeLeg, false, 2.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR6, speedLeg, degreeLeg, false, 2.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeAL7, speedLeg, -degreeLeg, false, 3.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR7, speedLeg, degreeLeg, false, 3.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeAL8, speedLeg, -degreeLeg, false, 3.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeAR8, speedLeg, degreeLeg, false, 3.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeBL1, speedLeg, -degreeLeg, false, 4.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeBR1, speedLeg, degreeLeg, false, 4.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeBL2, speedLeg, -degreeLeg, false, 4.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeBR2, speedLeg, degreeLeg, false, 4.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeBL3, speedLeg, -degreeLeg, false, 5.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeBR3, speedLeg, degreeLeg, false, 5.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeBL4, speedLeg, -degreeLeg, false, 5.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeBR4, speedLeg, degreeLeg, false, 5.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeBL5, speedLeg, -degreeLeg, false, 6.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeBR5, speedLeg, degreeLeg, false, 6.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeBL6, speedLeg, -degreeLeg, false, 6.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeBR6, speedLeg, degreeLeg, false, 6.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL1, speedLeg, -degreeLeg, false, 7.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR1, speedLeg, degreeLeg, false, 7.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL2, speedLeg, -degreeLeg, false, 7.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR2, speedLeg, degreeLeg, false, 7.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL3, speedLeg, -degreeLeg, false, 8.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR3, speedLeg, degreeLeg, false, 8.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL4, speedLeg, -degreeLeg, false, 8.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR4, speedLeg, degreeLeg, false, 8.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL5, speedLeg, -degreeLeg, false, 9.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR5, speedLeg, degreeLeg, false, 9.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL6, speedLeg, -degreeLeg, false, 9.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR6, speedLeg, degreeLeg, false, 9.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL7, speedLeg, -degreeLeg, false, 10.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR7, speedLeg, degreeLeg, false, 10.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeCL8, speedLeg, -degreeLeg, false, 10.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeCR8, speedLeg, degreeLeg, false, 10.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeDL1, speedLeg, -degreeLeg, false, 11.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeDR1, speedLeg, degreeLeg, false, 11.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeDL2, speedLeg, -degreeLeg, false, 11.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeDR2, speedLeg, degreeLeg, false, 11.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeDL3, speedLeg, -degreeLeg, false, 12.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeDR3, speedLeg, degreeLeg, false, 12.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeDL4, speedLeg, -degreeLeg, false, 12.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeDR4, speedLeg, degreeLeg, false, 12.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeDL5, speedLeg, -degreeLeg, false, 13.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeDR5, speedLeg, degreeLeg, false, 13.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeDL6, speedLeg, -degreeLeg, false, 13.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeDR6, speedLeg, degreeLeg, false, 13.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeEL1, speedLeg, -degreeLeg, false, 14.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeER1, speedLeg, degreeLeg, false, 14.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeEL2, speedLeg, -degreeLeg, false, 14.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeER2, speedLeg, degreeLeg, false, 14.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeEL3, speedLeg, -degreeLeg, false, 15.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeER3, speedLeg, degreeLeg, false, 15.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeEL4, speedLeg, -degreeLeg, false, 15.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeER4, speedLeg, degreeLeg, false, 15.5F, weightLeg, f2, 0.7F);
            this.flap(legtypeEL5, speedLeg, -degreeLeg, false, 16.0F, -weightLeg, f2, 0.7F);
            this.flap(legtypeER5, speedLeg, degreeLeg, false, 16.0F, weightLeg, f2, 0.7F);
            this.flap(legtypeEL6, speedLeg, -degreeLeg, false, 16.5F, -weightLeg, f2, 0.7F);
            this.flap(legtypeER6, speedLeg, degreeLeg, false, 16.5F, weightLeg, f2, 0.7F);

            if (f3 != 0) {
                this.chainWave(Tail, 0.65F, 0.045F, -1.5, f2, 0.8F);
            }
            else {
                this.chainWave(Tail, 0.25F, 0.015F, -1.5, f2, 0.8F);
            }

            if (!e.isInWater()) {
                this.body.offsetY = 1.14F;
                this.bob(body, -speed * 1.5F, 3F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(body, -speed, 0.12F, false, f2, 2);
                }
            }
        }
    }
}