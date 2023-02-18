package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRedfieldius extends AdvancedModelBase {
    private final AdvancedModelRenderer redfieldius;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer pectoralL;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer pectoralR;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer ventralL;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer ventralR;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;

    public ModelRedfieldius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.redfieldius = new AdvancedModelRenderer(this);
        this.redfieldius.setRotationPoint(1.0F, 23.0F, 5.5F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.redfieldius.addChild(body);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -2.5F, -6.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, -2.65F, -3.1F, 3, 5, 6, 0.01F, false));

        this.pectoralL = new AdvancedModelRenderer(this);
        this.pectoralL.setRotationPoint(0.5073F, -0.9074F, -7.6288F);
        this.body.addChild(pectoralL);
        this.setRotateAngle(pectoralL, 0.7854F, 0.0F, 0.0266F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralL.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 1.1345F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 0, 0.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, false));

        this.pectoralR = new AdvancedModelRenderer(this);
        this.pectoralR.setRotationPoint(-2.5073F, -0.9074F, -7.6288F);
        this.body.addChild(pectoralR);
        this.setRotateAngle(pectoralR, 0.7854F, 0.0F, -0.0266F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralR.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.1345F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 0, -4.0F, 0.0F, -1.5F, 4, 0, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(head);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.8F, -13.3F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 20, -2.5F, -1.9612F, 0.4702F, 3, 2, 5, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -2.6106F, -14.0538F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 27, -1.5F, -0.475F, 0.025F, 3, 2, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.05F, -2.9126F, -11.9606F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.75F, -0.825F, 1, 2, 2, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.6F, -0.75F, -0.825F, 1, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.075F, -2.6004F, -11.7734F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, -0.5F, -0.5F, -0.575F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, 1.65F, -0.5F, -0.575F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -3.9774F, -12.8423F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 16, -1.5F, 0.0089F, -1.0106F, 3, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.0F, -9.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 27, -2.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -1.0F, -9.0F);
        this.head.addChild(jaw);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.95F, 0.05F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 16, -2.5F, -0.9621F, -4.0286F, 3, 1, 4, -0.02F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-1.0F, -2.5533F, -2.8758F);
        this.body.addChild(body2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.8033F, -0.3742F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, -2.0F, -1.5F, -0.025F, 3, 2, 5, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, -2.6967F, -0.3742F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 8, -3.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.ventralL = new AdvancedModelRenderer(this);
        this.ventralL.setRotationPoint(1.4F, 1.8033F, 0.8758F);
        this.body2.addChild(ventralL);
        this.setRotateAngle(ventralL, 0.1129F, 0.1334F, -0.8651F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ventralL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0869F, -0.0076F, 1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 3, 0.0F, 0.0F, -1.0F, 3, 0, 3, 0.0F, false));

        this.ventralR = new AdvancedModelRenderer(this);
        this.ventralR.setRotationPoint(-1.4F, 1.8033F, 0.8758F);
        this.body2.addChild(ventralR);
        this.setRotateAngle(ventralR, 0.1129F, -0.1334F, 0.8651F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ventralR.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0869F, 0.0076F, -1.5708F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 3, -3.0F, 0.0F, -1.0F, 3, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3787F, 4.4156F);
        this.body2.addChild(tail);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.8124F, 1.5842F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 15, 0.0F, -3.15F, -1.0F, 0, 5, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.882F, 0.1102F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6109F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 22, 0.0F, -0.5F, -0.1F, 0, 6, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.882F, 0.1102F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 0, -1.0F, -2.0F, -0.1F, 2, 2, 6, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.118F, -0.2898F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 11, -1.0F, 0.2927F, -0.6374F, 2, 2, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(1.5F, -0.618F, 5.6852F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 4, -1.5F, -2.5F, 0.0F, 0, 6, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.redfieldius.render(f5);
    }
    public void renderStaticWall(float f) {
        this.redfieldius.rotateAngleY = (float) Math.toRadians(90);
        this.redfieldius.offsetX = -0.03F;
        this.redfieldius.offsetY = -0.21F;
        this.redfieldius.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.redfieldius.rotateAngleY = (float) Math.toRadians(90);
        this.redfieldius.offsetY = -0.34F;
        this.redfieldius.offsetX = -0.0F;
        this.redfieldius.offsetZ = -0.065F;
        this.redfieldius.render(0.01F);
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
        this.redfieldius.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(redfieldius, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(ventralL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(ventralL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(ventralR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(ventralR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.redfieldius.rotateAngleZ = (float) Math.toRadians(90);
                this.redfieldius.offsetY = -0.1F;
                this.bob(redfieldius, -speed, 5F, false, f2, 1);
            }
        }
    }
}
