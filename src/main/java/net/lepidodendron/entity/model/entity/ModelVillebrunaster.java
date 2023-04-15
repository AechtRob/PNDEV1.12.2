package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVillebrunaster extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer core;
    private final AdvancedModelRenderer armmiddlebase;
    private final AdvancedModelRenderer armbase;
    private final AdvancedModelRenderer arm1base_r1;
    private final AdvancedModelRenderer arm1base_r2;
    private final AdvancedModelRenderer arm1base_r3;
    private final AdvancedModelRenderer armmiddlebase2;
    private final AdvancedModelRenderer armbase2;
    private final AdvancedModelRenderer arm1base_r4;
    private final AdvancedModelRenderer arm1base_r5;
    private final AdvancedModelRenderer arm1base_r6;
    private final AdvancedModelRenderer armmiddlebase3;
    private final AdvancedModelRenderer armbase3;
    private final AdvancedModelRenderer arm1base_r7;
    private final AdvancedModelRenderer arm1base_r8;
    private final AdvancedModelRenderer arm1base_r9;
    private final AdvancedModelRenderer armmiddlebase4;
    private final AdvancedModelRenderer armbase4;
    private final AdvancedModelRenderer arm1base_r10;
    private final AdvancedModelRenderer arm1base_r11;
    private final AdvancedModelRenderer arm1base_r12;
    private final AdvancedModelRenderer armmiddlebase5;
    private final AdvancedModelRenderer armbase5;
    private final AdvancedModelRenderer arm1base_r13;
    private final AdvancedModelRenderer arm1base_r14;
    private final AdvancedModelRenderer arm1base_r15;

    public ModelVillebrunaster() {
        this.textureWidth = 27;
        this.textureHeight = 22;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.core = new AdvancedModelRenderer(this);
        this.core.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.root.addChild(core);
        this.core.cubeList.add(new ModelBox(core, 0, 0, -3.0F, -0.975F, -4.0F, 6, 1, 6, 0.01F, false));
        this.core.cubeList.add(new ModelBox(core, 0, 7, -2.0F, -1.725F, -3.0F, 4, 1, 4, 0.0F, false));

        this.armmiddlebase = new AdvancedModelRenderer(this);
        this.armmiddlebase.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase);


        this.armbase = new AdvancedModelRenderer(this);
        this.armbase.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase.addChild(armbase);
        this.armbase.cubeList.add(new ModelBox(armbase, 12, 7, -1.5F, 0.0F, -2.25F, 3, 1, 3, 0.01F, false));
        this.armbase.cubeList.add(new ModelBox(armbase, 18, 1, -0.5F, 1.05F, -4.25F, 1, 0, 6, 0.0F, false));
        this.armbase.cubeList.add(new ModelBox(armbase, 0, 0, -0.5F, 0.0F, -4.25F, 1, 1, 2, 0.01F, false));

        this.arm1base_r1 = new AdvancedModelRenderer(this);
        this.arm1base_r1.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase.addChild(arm1base_r1);
        this.setRotateAngle(arm1base_r1, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r1.cubeList.add(new ModelBox(arm1base_r1, 8, 12, -0.375F, -25.0F, 0.35F, 4, 1, 2, 0.0F, true));

        this.arm1base_r2 = new AdvancedModelRenderer(this);
        this.arm1base_r2.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase.addChild(arm1base_r2);
        this.setRotateAngle(arm1base_r2, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r2.cubeList.add(new ModelBox(arm1base_r2, 8, 12, -3.625F, -25.0F, 0.35F, 4, 1, 2, 0.005F, false));

        this.arm1base_r3 = new AdvancedModelRenderer(this);
        this.arm1base_r3.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.armbase.addChild(arm1base_r3);
        this.setRotateAngle(arm1base_r3, 0.1745F, 0.0F, 0.0F);
        this.arm1base_r3.cubeList.add(new ModelBox(arm1base_r3, 0, 12, -1.0F, 0.0F, 0.15F, 2, 1, 4, 0.0F, false));

        this.armmiddlebase2 = new AdvancedModelRenderer(this);
        this.armmiddlebase2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase2);
        this.setRotateAngle(armmiddlebase2, 0.0F, -1.2566F, 0.0F);


        this.armbase2 = new AdvancedModelRenderer(this);
        this.armbase2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase2.addChild(armbase2);
        this.armbase2.cubeList.add(new ModelBox(armbase2, 12, 7, -1.5F, -0.015F, -2.25F, 3, 1, 3, 0.01F, false));
        this.armbase2.cubeList.add(new ModelBox(armbase2, 18, 1, -0.5F, 1.05F, -4.25F, 1, 0, 6, 0.0F, false));
        this.armbase2.cubeList.add(new ModelBox(armbase2, 0, 0, -0.5F, 0.0F, -4.25F, 1, 1, 2, 0.01F, false));

        this.arm1base_r4 = new AdvancedModelRenderer(this);
        this.arm1base_r4.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase2.addChild(arm1base_r4);
        this.setRotateAngle(arm1base_r4, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r4.cubeList.add(new ModelBox(arm1base_r4, 8, 12, -0.375F, -25.0F, 0.35F, 4, 1, 2, 0.0F, true));

        this.arm1base_r5 = new AdvancedModelRenderer(this);
        this.arm1base_r5.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase2.addChild(arm1base_r5);
        this.setRotateAngle(arm1base_r5, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r5.cubeList.add(new ModelBox(arm1base_r5, 8, 12, -3.625F, -25.0F, 0.35F, 4, 1, 2, 0.005F, false));

        this.arm1base_r6 = new AdvancedModelRenderer(this);
        this.arm1base_r6.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.armbase2.addChild(arm1base_r6);
        this.setRotateAngle(arm1base_r6, 0.1745F, 0.0F, 0.0F);
        this.arm1base_r6.cubeList.add(new ModelBox(arm1base_r6, 0, 12, -1.0F, 0.0F, 0.15F, 2, 1, 4, 0.0F, false));

        this.armmiddlebase3 = new AdvancedModelRenderer(this);
        this.armmiddlebase3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase3);
        this.setRotateAngle(armmiddlebase3, 0.0F, -2.5133F, 0.0F);


        this.armbase3 = new AdvancedModelRenderer(this);
        this.armbase3.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase3.addChild(armbase3);
        this.armbase3.cubeList.add(new ModelBox(armbase3, 12, 7, -1.5F, -0.01F, -2.25F, 3, 1, 3, 0.005F, false));
        this.armbase3.cubeList.add(new ModelBox(armbase3, 18, 1, -0.5F, 1.05F, -4.25F, 1, 0, 6, 0.0F, false));
        this.armbase3.cubeList.add(new ModelBox(armbase3, 0, 0, -0.5F, 0.0F, -4.25F, 1, 1, 2, 0.01F, false));

        this.arm1base_r7 = new AdvancedModelRenderer(this);
        this.arm1base_r7.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase3.addChild(arm1base_r7);
        this.setRotateAngle(arm1base_r7, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r7.cubeList.add(new ModelBox(arm1base_r7, 8, 12, -0.375F, -25.0F, 0.35F, 4, 1, 2, 0.0F, true));

        this.arm1base_r8 = new AdvancedModelRenderer(this);
        this.arm1base_r8.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase3.addChild(arm1base_r8);
        this.setRotateAngle(arm1base_r8, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r8.cubeList.add(new ModelBox(arm1base_r8, 8, 12, -3.625F, -25.0F, 0.35F, 4, 1, 2, 0.005F, false));

        this.arm1base_r9 = new AdvancedModelRenderer(this);
        this.arm1base_r9.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.armbase3.addChild(arm1base_r9);
        this.setRotateAngle(arm1base_r9, 0.1745F, 0.0F, 0.0F);
        this.arm1base_r9.cubeList.add(new ModelBox(arm1base_r9, 0, 12, -1.0F, 0.0F, 0.15F, 2, 1, 4, 0.0F, false));

        this.armmiddlebase4 = new AdvancedModelRenderer(this);
        this.armmiddlebase4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase4);
        this.setRotateAngle(armmiddlebase4, 0.0F, 2.5133F, 0.0F);


        this.armbase4 = new AdvancedModelRenderer(this);
        this.armbase4.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase4.addChild(armbase4);
        this.armbase4.cubeList.add(new ModelBox(armbase4, 12, 7, -1.5F, 0.0F, -2.25F, 3, 1, 3, 0.01F, false));
        this.armbase4.cubeList.add(new ModelBox(armbase4, 0, 0, -0.5F, 0.0F, -4.25F, 1, 1, 2, 0.01F, false));
        this.armbase4.cubeList.add(new ModelBox(armbase4, 18, 1, -0.5F, 1.05F, -4.25F, 1, 0, 6, 0.0F, false));

        this.arm1base_r10 = new AdvancedModelRenderer(this);
        this.arm1base_r10.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase4.addChild(arm1base_r10);
        this.setRotateAngle(arm1base_r10, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r10.cubeList.add(new ModelBox(arm1base_r10, 8, 12, -0.375F, -25.0F, 0.35F, 4, 1, 2, 0.0F, true));

        this.arm1base_r11 = new AdvancedModelRenderer(this);
        this.arm1base_r11.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase4.addChild(arm1base_r11);
        this.setRotateAngle(arm1base_r11, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r11.cubeList.add(new ModelBox(arm1base_r11, 8, 12, -3.625F, -25.0F, 0.35F, 4, 1, 2, 0.005F, false));

        this.arm1base_r12 = new AdvancedModelRenderer(this);
        this.arm1base_r12.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.armbase4.addChild(arm1base_r12);
        this.setRotateAngle(arm1base_r12, 0.1745F, 0.0F, 0.0F);
        this.arm1base_r12.cubeList.add(new ModelBox(arm1base_r12, 0, 12, -1.0F, 0.0F, 0.15F, 2, 1, 4, 0.0F, false));

        this.armmiddlebase5 = new AdvancedModelRenderer(this);
        this.armmiddlebase5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.core.addChild(armmiddlebase5);
        this.setRotateAngle(armmiddlebase5, 0.0F, 1.2566F, 0.0F);


        this.armbase5 = new AdvancedModelRenderer(this);
        this.armbase5.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.armmiddlebase5.addChild(armbase5);
        this.armbase5.cubeList.add(new ModelBox(armbase5, 12, 7, -1.5F, -0.01F, -2.25F, 3, 1, 3, 0.005F, false));
        this.armbase5.cubeList.add(new ModelBox(armbase5, 18, 1, -0.5F, 1.05F, -4.25F, 1, 0, 6, 0.0F, false));
        this.armbase5.cubeList.add(new ModelBox(armbase5, 0, 0, -0.5F, 0.0F, -4.25F, 1, 1, 2, 0.01F, false));

        this.arm1base_r13 = new AdvancedModelRenderer(this);
        this.arm1base_r13.setRotationPoint(1.0F, 25.0F, -4.25F);
        this.armbase5.addChild(arm1base_r13);
        this.setRotateAngle(arm1base_r13, 0.0F, -0.7854F, 0.0F);
        this.arm1base_r13.cubeList.add(new ModelBox(arm1base_r13, 8, 12, -0.375F, -25.0F, 0.35F, 4, 1, 2, 0.0F, true));

        this.arm1base_r14 = new AdvancedModelRenderer(this);
        this.arm1base_r14.setRotationPoint(-1.0F, 25.0F, -4.25F);
        this.armbase5.addChild(arm1base_r14);
        this.setRotateAngle(arm1base_r14, 0.0F, 0.7854F, 0.0F);
        this.arm1base_r14.cubeList.add(new ModelBox(arm1base_r14, 8, 12, -3.625F, -25.0F, 0.35F, 4, 1, 2, 0.005F, false));

        this.arm1base_r15 = new AdvancedModelRenderer(this);
        this.arm1base_r15.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.armbase5.addChild(arm1base_r15);
        this.setRotateAngle(arm1base_r15, 0.1745F, 0.0F, 0.0F);
        this.arm1base_r15.cubeList.add(new ModelBox(arm1base_r15, 0, 12, -1.0F, 0.0F, 0.15F, 2, 1, 4, 0.0F, false));


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
        AdvancedModelRenderer[] Arm1 = {this.armbase};
        AdvancedModelRenderer[] Arm2 = {this.armbase2};
        AdvancedModelRenderer[] Arm3 = {this.armbase3};
        AdvancedModelRenderer[] Arm4 = {this.armbase4};
        AdvancedModelRenderer[] Arm5 = {this.armbase5};


        float speed = 0.135F;
        float modifier = 1f;
        if (f3 == 0) {
            modifier = 0.5F;
        }
//        this.chainSwing(Arm1, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
//        this.chainSwing(Arm2, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
//        this.chainSwing(Arm3, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
//        this.chainSwing(Arm4, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);
//        this.chainSwing(Arm5, speed * modifier, 0.4F * modifier, -4, f2, 0.7F);


    }
}
