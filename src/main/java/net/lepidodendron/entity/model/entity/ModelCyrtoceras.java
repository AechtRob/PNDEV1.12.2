package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCyrtoceras extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r12;

    public ModelCyrtoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -11.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 47, -4.0F, -9.0F, 3.0F, 8, 9, 4, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 3.1416F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -6.0F, -12.0F, -8.0F, 12, 12, 13, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.shell.addChild(bone2);
        this.setRotateAngle(bone2, 0.1309F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 25, -5.0F, -10.0F, 0.0F, 10, 10, 12, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -0.9483F, 11.3615F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.3927F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 36, 39, -4.0F, -7.7517F, -0.1708F, 8, 8, 8, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -2.0517F, 7.8164F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.3927F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0517F, -0.1212F);
        this.bone4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 0, -3.0F, -5.8517F, -1.0F, 6, 6, 7, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.5517F, 4.5802F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, 0.4363F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 50, 13, -2.0F, -4.5F, 0.2987F, 4, 4, 5, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -1.5F, 3.2987F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.48F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.0F, -1.5081F, 0.999F, 2, 3, 4, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(3.0F, -4.0F, 7.0F);
        this.body.addChild(leg1);
        this.leg1.cubeList.add(new ModelBox(leg1, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-3.0F, -4.0F, 7.0F);
        this.body.addChild(leg6);
        this.leg6.cubeList.add(new ModelBox(leg6, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, true));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(3.0F, -6.0F, 7.0F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, -0.0436F, -0.3927F);
        this.leg2.cubeList.add(new ModelBox(leg2, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(-3.0F, -6.0F, 7.0F);
        this.body.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0436F, 0.3927F);
        this.leg7.cubeList.add(new ModelBox(leg7, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg7.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, true));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(3.0F, -2.0F, 7.0F);
        this.body.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, -0.0436F, 0.3491F);
        this.leg3.cubeList.add(new ModelBox(leg3, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-3.0F, -2.0F, 7.0F);
        this.body.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0436F, -0.3491F);
        this.leg8.cubeList.add(new ModelBox(leg8, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg8.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, true));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(2.0F, -1.0F, 7.0F);
        this.body.addChild(leg4);
        this.setRotateAngle(leg4, -0.0873F, 0.0436F, 1.3963F);
        this.leg4.cubeList.add(new ModelBox(leg4, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(-2.0F, -1.0F, 7.0F);
        this.body.addChild(leg10);
        this.setRotateAngle(leg10, -0.0873F, -0.0436F, -1.3963F);
        this.leg10.cubeList.add(new ModelBox(leg10, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg10.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2182F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, true));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(1.0F, -7.0F, 7.0F);
        this.body.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.0F, -1.3526F);
        this.leg5.cubeList.add(new ModelBox(leg5, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(-1.0F, -7.0F, 7.0F);
        this.body.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.0F, 1.3526F);
        this.leg9.cubeList.add(new ModelBox(leg9, 24, 48, -1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.leg9.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 55, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -11.0F, 3.0F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, -0.0873F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 50, 22, -3.0F, 2.0F, 5.0F, 6, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 32, 25, -5.0F, 0.0F, 0.0F, 10, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.bone.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 33, -4.0F, 0.0F, 1.0F, 8, 2, 3, 0.0F, false));

        this.leg1.rotateAngleY = 0.28F;
        this.leg2.rotateAngleY = 0.28F;
        this.leg3.rotateAngleY = 0.28F;
        this.leg4.rotateAngleY = 0.28F;
        this.leg5.rotateAngleY = 0.28F;
        this.leg6.rotateAngleY = -0.28F;
        this.leg7.rotateAngleY = -0.28F;
        this.leg8.rotateAngleY = -0.28F;
        this.leg9.rotateAngleY = -0.28F;
        this.leg10.rotateAngleY = -0.28F;

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.2F);
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
        this.body.offsetY = 1.2F;

        AdvancedModelRenderer[] tentacle1 = {this.leg1, this.cube_r2};
        AdvancedModelRenderer[] tentacle2 = {this.leg2, this.cube_r4};
        AdvancedModelRenderer[] tentacle3 = {this.leg3, this.cube_r6};
        AdvancedModelRenderer[] tentacle4 = {this.leg4, this.cube_r8};
        AdvancedModelRenderer[] tentacle5 = {this.leg5, this.cube_r10};
        AdvancedModelRenderer[] tentacle6 = {this.leg6, this.cube_r3};
        AdvancedModelRenderer[] tentacle7 = {this.leg7, this.cube_r5};
        AdvancedModelRenderer[] tentacle8 = {this.leg8, this.cube_r7};
        AdvancedModelRenderer[] tentacle9 = {this.leg9, this.cube_r11};
        AdvancedModelRenderer[] tentacle10 = {this.leg10, this.cube_r9};

        float speed = 0.09F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainSwing(tentacle1, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainSwing(tentacle3, speed, -0.3F, -2, f2, 1F);
        //Left lower bottom:
        this.chainSwing(tentacle4, speed, -0.3F, -2, f2, 1F);
        //Left upper middle:
        this.chainSwing(tentacle2, speed, -0.3F, -2, f2, 1F);
        //Left upper top:
        this.chainSwing(tentacle5, speed, -0.3F, -2, f2, 1F);

        //Right:
        this.chainSwing(tentacle6, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainSwing(tentacle8, speed, 0.3F, -2, f2, 1F);
        //Right lower bottom:
        this.chainSwing(tentacle10, speed, 0.3F, -2, f2, 1F);
        //Right upper middle:
        this.chainSwing(tentacle7, speed, 0.3F, -2, f2, 1F);
        //Right upper top:
        this.chainSwing(tentacle9, speed, 0.3F, -2, f2, 1F);

        if (e.isInWater()) {
            this.bob(body, 0.1F, 2.0F, false, f2, 2);
            //this.body.offsetX = this.moveBox(speed, 1.5F, true, 2, 1.5F);
        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.15F;
        }

    }

}
