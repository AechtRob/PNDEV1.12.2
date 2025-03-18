package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAscoceras extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended tentacle;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended tentacle3;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended tentacle4;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended tentacle5;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended tentacle6;
    private final AdvancedModelRendererExtended cube_r15;

    public ModelAscoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(0.5F, 31.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -9.8388F, 9.7026F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4669F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 22, -3.0F, -2.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -13.6995F, 8.5754F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.24F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 27, -3.0F, 0.0107F, 0.0022F, 5, 2, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -11.453F, 6.463F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2836F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 7, -3.0F, -1.5549F, -0.3411F, 5, 4, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -10.1555F, 0.8373F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -3.0F, -1.8561F, -0.2785F, 5, 4, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.5F, -9.2752F, -5.8021F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 28, -2.0F, -0.125F, -1.5F, 4, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-0.5F, -11.725F, -5.2226F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3316F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 29, -2.0F, 0.0024F, -3.0259F, 4, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 7, -2.0F, 1.0024F, -1.0259F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -9.75F, -2.0F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.048F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 10, -3.0F, -2.125F, -3.15F, 5, 4, 6, 0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(-0.5F, -9.2752F, -5.8021F);
        this.shell.addChild(head);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 2.0375F, 0.2257F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5061F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.5F, -0.975F, -1.575F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 0, -1.05F, -1.5F, -2.45F, 2, 3, 3, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 0, 0.95F, -1.5F, -2.45F, 1, 3, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, 1.0F, -1.1F, -1.45F, 1, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, -2.0F, -1.1F, -1.45F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 11, -1.95F, -1.5F, -2.45F, 1, 3, 3, 0.0F, false));

        this.tentacle = new AdvancedModelRendererExtended(this);
        this.tentacle.setRotationPoint(-1.25F, 1.5125F, -2.1373F);
        this.head.addChild(tentacle);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(1.25F, -1.7125F, 2.1373F);
        this.tentacle.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 15, -1.75F, 0.4F, -7.95F, 1, 1, 6, 0.0F, false));

        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(0.0F, 1.7125F, -1.8873F);
        this.head.addChild(tentacle2);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.25F, -1.7125F, 1.8873F);
        this.tentacle2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3316F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 22, -1.75F, 0.4F, -7.95F, 1, 1, 6, 0.0F, false));

        this.tentacle3 = new AdvancedModelRendererExtended(this);
        this.tentacle3.setRotationPoint(1.25F, 1.5125F, -2.1373F);
        this.head.addChild(tentacle3);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(1.25F, -1.7125F, 2.1373F);
        this.tentacle3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3316F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 0, -1.75F, 0.4F, -7.95F, 1, 1, 6, 0.0F, false));

        this.tentacle4 = new AdvancedModelRendererExtended(this);
        this.tentacle4.setRotationPoint(1.25F, 0.3253F, -2.3601F);
        this.head.addChild(tentacle4);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(1.25F, -1.8753F, 2.3601F);
        this.tentacle4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3316F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 21, -1.75F, 0.4F, -8.45F, 1, 1, 6, 0.0F, false));

        this.tentacle5 = new AdvancedModelRendererExtended(this);
        this.tentacle5.setRotationPoint(0.0F, 0.1253F, -2.3601F);
        this.head.addChild(tentacle5);


        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(1.25F, -1.8753F, 2.3601F);
        this.tentacle5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3316F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 20, -1.75F, 0.4F, -8.45F, 1, 1, 6, 0.0F, false));

        this.tentacle6 = new AdvancedModelRendererExtended(this);
        this.tentacle6.setRotationPoint(-1.25F, 0.3253F, -2.3601F);
        this.head.addChild(tentacle6);


        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(1.25F, -1.8753F, 2.3601F);
        this.tentacle6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3316F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 14, -1.75F, 0.4F, -8.45F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.shell.render(f5 * 0.21F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.shell.offsetY = -2.0F;
        this.shell.offsetX = 0.05F;
        this.shell.rotateAngleY = (float)Math.toRadians(200);
        this.shell.rotateAngleX = (float)Math.toRadians(8);
        this.shell.rotateAngleZ = (float)Math.toRadians(-8);
        this.shell.scaleChildren = true;
        float scaler = 3.46F;
        this.shell.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(shell, 0.3F, 3.8F, 0.0F);
        //End of pose, now render the model:
        this.shell.render(f);
        //Reset rotations, positions and sizing:
        this.shell.setScale(1.0F, 1.0F, 1.0F);
        this.shell.scaleChildren = false;
        resetToDefaultPose();

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
        this.shell.offsetY = 1.1F;
        this.shell.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] t1 = {this.tentacle};
        AdvancedModelRendererExtended[] t2 = {this.tentacle2};
        AdvancedModelRendererExtended[] t3 = {this.tentacle3};
        AdvancedModelRendererExtended[] t4 = {this.tentacle4};
        AdvancedModelRendererExtended[] t5 = {this.tentacle5};
        AdvancedModelRendererExtended[] t6 = {this.tentacle6};


        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        //
        this.chainWave(t3, speed, 0.25F, -2, f2, 0.5F);
        this.chainSwing(t3, speed, -0.1F, -2, f2, 0.5F);
        //Left lower middle:
        this.chainWave(t2, speed, 0.3F, -2, f2, 0.5F);
        //Left upper top:
        this.chainWave(t4, speed, -0.25F, -2, f2, 0.5F);
        this.chainSwing(t4, speed, -0.1F, -2, f2, 0.5F);

        //Right:
        //Right lower bottom:
        this.chainWave(t1, speed, 0.25F, -2, f2, 0.5F);
        this.chainSwing(t1, speed, 0.1F, -2, f2, 0.5F);
        //Right upper middle:
        this.chainWave(t5, speed, -0.3F, -2, f2, 0.5F);
        //Right upper top:
        this.chainWave(t6, speed, -0.25F, -2, f2, 0.5F);
        this.chainSwing(t6, speed, 0.1F, -2, f2, 0.5F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(shell, bobSpeed, 0.8F, false, f2, 2);
            this.shell.offsetZ = this.moveBoxExtended(speed, 0.05F, false, 0.5F, f2, 1);
        }
        else {
            this.shell.rotateAngleZ = (float) Math.toRadians(90);
            this.shell.offsetY = 1F;
        }

    }

}
