package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBundenbachiellus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer ArmR;
    private final AdvancedModelRenderer ArmfillamentR1;
    private final AdvancedModelRenderer ArmfillamentR2;
    private final AdvancedModelRenderer ArmfillamentR3;
    private final AdvancedModelRenderer ArmL;
    private final AdvancedModelRenderer ArmfillamentL1;
    private final AdvancedModelRenderer ArmfillamentL2;
    private final AdvancedModelRenderer ArmfillamentL3;
    private final AdvancedModelRenderer HeadlegR;
    private final AdvancedModelRenderer HeadlegL;
    private final AdvancedModelRenderer HeadlegR2;
    private final AdvancedModelRenderer HeadlegL2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body9;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body10;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legL10;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body11;
    private final AdvancedModelRenderer legR11;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer legL11;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Body12;
    private final AdvancedModelRenderer legR12;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer legL12;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Telson;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;

    public ModelBundenbachiellus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 22.2F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 11, 10, -2.0F, -1.25F, -8.0F, 4, 1, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 9, 14, -1.5F, -1.0F, -7.9F, 3, 1, 3, 0.0F, false));

        this.ArmR = new AdvancedModelRenderer(this);
        this.ArmR.setRotationPoint(-1.0F, -0.75F, -7.25F);
        this.Body.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.0F, -0.829F, -0.2618F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 16, 18, -2.0F, -0.35F, -0.5F, 2, 1, 1, 0.0F, false));

        this.ArmfillamentR1 = new AdvancedModelRenderer(this);
        this.ArmfillamentR1.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.ArmR.addChild(ArmfillamentR1);
        this.setRotateAngle(ArmfillamentR1, 0.0F, -0.2618F, 0.0F);
        this.ArmfillamentR1.cubeList.add(new ModelBox(ArmfillamentR1, 0, 0, -6.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmfillamentR2 = new AdvancedModelRenderer(this);
        this.ArmfillamentR2.setRotationPoint(-1.75F, 0.25F, 0.0F);
        this.ArmR.addChild(ArmfillamentR2);
        this.setRotateAngle(ArmfillamentR2, 0.0F, 0.2618F, -0.0873F);
        this.ArmfillamentR2.cubeList.add(new ModelBox(ArmfillamentR2, 0, 0, -6.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmfillamentR3 = new AdvancedModelRenderer(this);
        this.ArmfillamentR3.setRotationPoint(-1.75F, 0.5F, 0.0F);
        this.ArmR.addChild(ArmfillamentR3);
        this.setRotateAngle(ArmfillamentR3, 0.0F, 0.7854F, -0.2618F);
        this.ArmfillamentR3.cubeList.add(new ModelBox(ArmfillamentR3, 0, 0, -6.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, false));

        this.ArmL = new AdvancedModelRenderer(this);
        this.ArmL.setRotationPoint(1.0F, -0.75F, -7.25F);
        this.Body.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.0F, 0.829F, 0.2618F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 16, 18, 0.0F, -0.35F, -0.5F, 2, 1, 1, 0.0F, true));

        this.ArmfillamentL1 = new AdvancedModelRenderer(this);
        this.ArmfillamentL1.setRotationPoint(1.75F, 0.0F, 0.0F);
        this.ArmL.addChild(ArmfillamentL1);
        this.setRotateAngle(ArmfillamentL1, 0.0F, 0.2618F, 0.0F);
        this.ArmfillamentL1.cubeList.add(new ModelBox(ArmfillamentL1, 0, 0, 0.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, true));

        this.ArmfillamentL2 = new AdvancedModelRenderer(this);
        this.ArmfillamentL2.setRotationPoint(1.75F, 0.25F, 0.0F);
        this.ArmL.addChild(ArmfillamentL2);
        this.setRotateAngle(ArmfillamentL2, 0.0F, -0.2618F, 0.0873F);
        this.ArmfillamentL2.cubeList.add(new ModelBox(ArmfillamentL2, 0, 0, 0.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, true));

        this.ArmfillamentL3 = new AdvancedModelRenderer(this);
        this.ArmfillamentL3.setRotationPoint(1.75F, 0.5F, 0.0F);
        this.ArmL.addChild(ArmfillamentL3);
        this.setRotateAngle(ArmfillamentL3, 0.0F, -0.7854F, 0.2618F);
        this.ArmfillamentL3.cubeList.add(new ModelBox(ArmfillamentL3, 0, 0, 0.0F, 0.0F, -0.5F, 6, 0, 5, 0.0F, true));

        this.HeadlegR = new AdvancedModelRenderer(this);
        this.HeadlegR.setRotationPoint(-1.25F, -0.1F, -7.0F);
        this.Body.addChild(HeadlegR);
        this.setRotateAngle(HeadlegR, 0.0F, -0.3054F, -0.5236F);
        this.HeadlegR.cubeList.add(new ModelBox(HeadlegR, 13, 9, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.HeadlegL = new AdvancedModelRenderer(this);
        this.HeadlegL.setRotationPoint(1.25F, -0.1F, -7.0F);
        this.Body.addChild(HeadlegL);
        this.setRotateAngle(HeadlegL, 0.0F, 0.3054F, 0.5236F);
        this.HeadlegL.cubeList.add(new ModelBox(HeadlegL, 13, 9, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.HeadlegR2 = new AdvancedModelRenderer(this);
        this.HeadlegR2.setRotationPoint(-1.25F, -0.2F, -6.5F);
        this.Body.addChild(HeadlegR2);
        this.setRotateAngle(HeadlegR2, 0.0F, -0.0436F, -0.5672F);
        this.HeadlegR2.cubeList.add(new ModelBox(HeadlegR2, 0, 13, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.HeadlegL2 = new AdvancedModelRenderer(this);
        this.HeadlegL2.setRotationPoint(1.25F, -0.2F, -6.5F);
        this.Body.addChild(HeadlegL2);
        this.setRotateAngle(HeadlegL2, 0.0F, 0.0436F, 0.5672F);
        this.HeadlegL2.cubeList.add(new ModelBox(HeadlegL2, 0, 13, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-1.25F, -0.2F, -5.5F);
        this.Body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, -0.0436F, -0.3927F);
        this.legR.cubeList.add(new ModelBox(legR, 16, 14, -4.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0436F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 7, -4.25F, 0.0F, 0.0F, 4, 0, 2, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.25F, -0.2F, -5.5F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0436F, 0.3927F);
        this.legL.cubeList.add(new ModelBox(legL, 16, 14, 0.25F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, -0.0436F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 7, 0.25F, 0.0F, 0.0F, 4, 0, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.5F, -4.9F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, -0.01F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.0436F, -0.3927F);
        this.legR2.cubeList.add(new ModelBox(legR2, 14, 5, -5.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0436F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 14, -5.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0436F, 0.3927F);
        this.legL2.cubeList.add(new ModelBox(legL2, 14, 5, 0.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, -0.0436F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, 0.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.0436F, -0.3927F);
        this.legR3.cubeList.add(new ModelBox(legR3, 14, 5, -5.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0436F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -5.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0436F, 0.3927F);
        this.legL3.cubeList.add(new ModelBox(legL3, 14, 5, 0.25F, 0.0F, -0.5F, 5, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, -0.0436F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 14, 0.25F, 0.0F, 0.0F, 5, 0, 2, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, -0.01F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, -0.0436F, -0.3927F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 11, -6.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -6.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0436F, 0.3927F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 11, 0.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, -0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 9, 0.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, true));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.01F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, -0.0436F, -0.3927F);
        this.legR5.cubeList.add(new ModelBox(legR5, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1745F, 0.0436F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0436F, 0.3927F);
        this.legL5.cubeList.add(new ModelBox(legL5, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1745F, -0.0436F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, -0.01F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, -0.0436F, -0.3927F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0436F, 0.3927F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.1745F, -0.0436F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.01F, false));
        this.Body7.cubeList.add(new ModelBox(Body7, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, -0.0436F, -0.3927F);
        this.legR7.cubeList.add(new ModelBox(legR7, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR7.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.1745F, 0.0436F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0436F, 0.3927F);
        this.legL7.cubeList.add(new ModelBox(legL7, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL7.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.1745F, -0.0436F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, -0.01F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body8.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, -0.0436F, -0.3927F);
        this.legR8.cubeList.add(new ModelBox(legR8, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR8.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1745F, 0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body8.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0436F, 0.3927F);
        this.legL8.cubeList.add(new ModelBox(legL8, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL8.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.1745F, -0.0436F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body9 = new AdvancedModelRenderer(this);
        this.Body9.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body8.addChild(Body9);
        this.Body9.cubeList.add(new ModelBox(Body9, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.01F, false));
        this.Body9.cubeList.add(new ModelBox(Body9, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body9.addChild(legR9);
        this.setRotateAngle(legR9, 0.0F, -0.0436F, -0.3927F);
        this.legR9.cubeList.add(new ModelBox(legR9, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR9.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0436F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body9.addChild(legL9);
        this.setRotateAngle(legL9, 0.0F, 0.0436F, 0.3927F);
        this.legL9.cubeList.add(new ModelBox(legL9, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL9.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1745F, -0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body10 = new AdvancedModelRenderer(this);
        this.Body10.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body9.addChild(Body10);
        this.Body10.cubeList.add(new ModelBox(Body10, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body10.cubeList.add(new ModelBox(Body10, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, -0.01F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body10.addChild(legR10);
        this.setRotateAngle(legR10, 0.0F, -0.0436F, -0.3927F);
        this.legR10.cubeList.add(new ModelBox(legR10, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR10.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.1745F, 0.0436F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body10.addChild(legL10);
        this.setRotateAngle(legL10, 0.0F, 0.0436F, 0.3927F);
        this.legL10.cubeList.add(new ModelBox(legL10, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL10.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.1745F, -0.0436F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body11 = new AdvancedModelRenderer(this);
        this.Body11.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body10.addChild(Body11);
        this.Body11.cubeList.add(new ModelBox(Body11, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.01F, false));
        this.Body11.cubeList.add(new ModelBox(Body11, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, 0.0F, false));

        this.legR11 = new AdvancedModelRenderer(this);
        this.legR11.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body11.addChild(legR11);
        this.setRotateAngle(legR11, 0.0F, -0.0436F, -0.3927F);
        this.legR11.cubeList.add(new ModelBox(legR11, 0, 7, -7.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR11.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.1745F, 0.0436F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 5, -7.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, false));

        this.legL11 = new AdvancedModelRenderer(this);
        this.legL11.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body11.addChild(legL11);
        this.setRotateAngle(legL11, 0.0F, 0.0436F, 0.3927F);
        this.legL11.cubeList.add(new ModelBox(legL11, 0, 7, 0.25F, 0.0F, -0.5F, 7, 0, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL11.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.1745F, -0.0436F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 5, 0.25F, 0.0F, 0.0F, 7, 0, 2, 0.0F, true));

        this.Body12 = new AdvancedModelRenderer(this);
        this.Body12.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body11.addChild(Body12);
        this.Body12.cubeList.add(new ModelBox(Body12, 8, 18, -1.5F, -0.6F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body12.cubeList.add(new ModelBox(Body12, 17, 2, -1.5F, -0.5F, 0.25F, 3, 1, 2, -0.01F, false));

        this.legR12 = new AdvancedModelRenderer(this);
        this.legR12.setRotationPoint(-1.25F, 0.3F, 1.65F);
        this.Body12.addChild(legR12);
        this.setRotateAngle(legR12, 0.0F, -0.0436F, -0.3927F);
        this.legR12.cubeList.add(new ModelBox(legR12, 0, 11, -6.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR12.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1745F, 0.0436F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 9, -6.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, false));

        this.legL12 = new AdvancedModelRenderer(this);
        this.legL12.setRotationPoint(1.25F, 0.3F, 1.65F);
        this.Body12.addChild(legL12);
        this.setRotateAngle(legL12, 0.0F, 0.0436F, 0.3927F);
        this.legL12.cubeList.add(new ModelBox(legL12, 0, 11, 0.25F, 0.0F, -0.5F, 6, 0, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL12.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.1745F, -0.0436F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 9, 0.25F, 0.0F, 0.0F, 6, 0, 2, 0.0F, true));

        this.Telson = new AdvancedModelRenderer(this);
        this.Telson.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.Body12.addChild(Telson);
        this.Telson.cubeList.add(new ModelBox(Telson, 0, 16, -1.5F, -0.45F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Telson.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.5236F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 13, 0, 0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Telson.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.5236F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 0, -1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.Body.render(f5 );
    }
    public void renderStaticDisplayCase(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0.05F;
        this.Body.offsetY = -0F;
        this.Body.offsetZ = 0.0F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(ArmfillamentL1, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(ArmfillamentL2, 0.0F, -0.2618F, 0.0873F);
        this.setRotateAngle(ArmfillamentL3, 0.0F, -0.7854F, 0.2618F);
        this.setRotateAngle(ArmfillamentR1, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(ArmfillamentR2, 0.0F, 0.2618F, -0.0873F);
        this.setRotateAngle(ArmfillamentR3, 0.0F, 0.7854F, -0.2618F);
        this.setRotateAngle(ArmL, 0.0F, 0.829F, 0.2618F);
        this.setRotateAngle(ArmR, 0.0F, -0.829F, -0.2618F);
        this.setRotateAngle(Body10, 0.1309F, -0.1309F, 0.0F);
        this.setRotateAngle(Body11, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body12, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(Body2, -0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(Body3, -0.0873F, 0.0873F, 0.0F);
        this.setRotateAngle(Body4, -0.0873F, 0.0873F, 0.0F);
        this.setRotateAngle(Body5, -0.0873F, 0.0873F, 0.0F);
        this.setRotateAngle(Body6, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Body7, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Body8, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Body9, 0.0873F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r10, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r12, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r13, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r14, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r15, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r16, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r17, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r18, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r19, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r20, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r21, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r22, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r23, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r24, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r25, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r7, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, -0.0436F);
        this.setRotateAngle(cube_r9, 0.0F, 0.1745F, 0.0436F);
        this.setRotateAngle(HeadlegL, 0.0F, 0.3054F, 0.5236F);
        this.setRotateAngle(HeadlegL2, 0.0F, 0.0436F, 0.5672F);
        this.setRotateAngle(HeadlegR, 0.0F, -0.3054F, -0.5236F);
        this.setRotateAngle(HeadlegR2, 0.0F, -0.0436F, -0.5672F);
        this.setRotateAngle(legL, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL10, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL11, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL12, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL2, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL3, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL4, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL5, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL6, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL7, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL8, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legL9, 0.0F, 0.0436F, 0.3927F);
        this.setRotateAngle(legR, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR10, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR11, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR12, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR2, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR3, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR4, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR5, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR6, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR7, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR8, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(legR9, 0.0F, -0.0436F, -0.3927F);
        this.setRotateAngle(Telson, 0.0F, -0.1309F, 0.0F);
        this.Body.offsetX = -0.05F;
        this.Body.offsetY = -0.55F;
        this.Body.offsetZ = 0.0F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        this.Body.offsetY = 0F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8, this.Body9, this.Body10, this.Body11};
        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL6, this.legL7, this.legL8, this.legL9, this.legL10,
                this.legL11, this.legL12};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR6, this.legR7, this.legR8, this.legR9, this.legR10,
                this.legR11, this.legR12};
        AdvancedModelRenderer[] handL = {this.HeadlegL, this.HeadlegL2};
        AdvancedModelRenderer[] handR = {this.HeadlegR, this.HeadlegR2};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.3F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(ArmL, speed, 0.5F, false, 3, -0.5F, f2, 0.3F);
            this.swing(ArmR, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
            if (!e.isInWater()) {
                this.Body.offsetY = 0F;

            } else {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.2F, -3, f2, 0.9F);
                this.chainWave(handL, speed, 0.2F, -3, f2, 1);
                this.chainSwing(handL, speed, 0.05F, -3, f2, 0.7F);
                this.chainWave(handR, speed, 0.2F, -3, f2, 1);
                this.chainSwing(handR, speed, 0.05F, -3, f2, 0.7F);
                this.chainSwing(legsL, speed, 0.1F, -3, f2, 0.7F);
                this.chainSwing(legsR, speed, 0.1F, -3, f2, 0.7F);
                this.swing(Body, speed, 0.4F, true, 0, 0, f2, 1);
            }

        }
    }
}
