package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTanyrhinichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftPelvic;
    private final AdvancedModelRenderer rightPelvic;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    public ModelTanyrhinichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.5F, -1.2F, -7.1F, 3, 3, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -0.3F, -7.1F, 3, 3, 8, 0.002F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 14, -1.5F, -0.3F, -9.1F, 3, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 33, 6, -1.5F, 0.7F, -9.1F, 3, 2, 2, 0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.9F, -9.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 35, 34, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(1.5F, 2.5F, -8.4F);
        this.body.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, 0.0F, -0.5672F, 0.7854F);
        this.leftPectoral.cubeList.add(new ModelBox(leftPectoral, 15, 12, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-1.5F, 2.5F, -8.4F);
        this.body.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, 0.0F, 0.5672F, -0.7854F);
        this.rightPectoral.cubeList.add(new ModelBox(rightPectoral, 15, 12, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.body.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 15, 0, -1.5F, -0.3F, -1.0F, 3, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, 4.0F);
        this.tail1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 8, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 24, -1.0F, 0.1F, -4.1F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 2.3F, 2.1F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4189F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -0.5F, -0.7459F, -0.0819F, 0, 3, 2, 0.0F, false));

        this.leftPelvic = new AdvancedModelRenderer(this);
        this.leftPelvic.setRotationPoint(1.0F, 2.4F, 0.0F);
        this.tail1.addChild(leftPelvic);
        this.setRotateAngle(leftPelvic, 0.0F, -0.5236F, 0.7854F);
        this.leftPelvic.cubeList.add(new ModelBox(leftPelvic, 9, 24, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.rightPelvic = new AdvancedModelRenderer(this);
        this.rightPelvic.setRotationPoint(-1.0F, 2.4F, 0.0F);
        this.tail1.addChild(rightPelvic);
        this.setRotateAngle(rightPelvic, 0.0F, 0.5236F, -0.7854F);
        this.rightPelvic.cubeList.add(new ModelBox(rightPelvic, 9, 24, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 18, 32, -1.0F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.7F, 2.0F);
        this.tail2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -0.5F, -1.3F, -1.9F, 0, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -0.7F, 2.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 19, -1.0F, 0.0F, -2.9F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 2.3F, -1.9F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4189F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 3, 16, -0.5F, 0.2541F, 1.9181F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.3F, 2.0F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3142F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, -1.0F, -1.0F, -2.1F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 28, -0.5F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0524F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 34, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 37, -0.5F, -1.0F, -3.2F, 1, 1, 3, -0.002F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.4102F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 8, 0.0F, -0.5F, -1.0F, 0, 4, 6, -0.0076F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 22, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.0076F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -8.5F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 27, 0, -0.7F, 0.2F, -4.9F, 1, 1, 1, 0.007F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 0, -1.5F, -0.3F, -1.5F, 3, 3, 2, 0.005F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 21, -0.3F, 0.2F, -4.9F, 1, 1, 1, 0.007F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.7F, 0.7189F, -3.8996F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3711F, -0.2792F, 0.0476F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 34, 0.0725F, -0.6326F, -0.0013F, 1, 1, 3, -0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.7F, 0.7189F, -3.8996F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0175F, -0.2793F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 25, -0.0179F, -0.5614F, -0.2957F, 1, 1, 3, -0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.7F, 0.7189F, -3.8996F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3711F, 0.2792F, -0.0476F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 34, -1.0725F, -0.6326F, -0.0013F, 1, 1, 3, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.7F, 0.7189F, -3.8996F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0175F, 0.2793F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 25, -0.9821F, -0.5614F, -0.2957F, 1, 1, 3, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.7F, 0.1F, -5.1F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1571F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 15, -1.0F, 0.5826F, -0.0252F, 1, 1, 4, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2F, -0.1F, -5.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1571F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 19, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 26, -0.9F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.3F, 0.1F, -5.1F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1571F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 26, -1.0F, 0.5826F, -0.0252F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.9F, -6.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4189F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 37, 0.0F, -0.9645F, -0.1657F, 1, 1, 2, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -0.1F, -5.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0349F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 31, 0.0F, 0.0F, -3.0F, 1, 1, 4, 0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9F, -1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.3F, -0.6811F, -1.5996F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.212F, -0.3139F, -0.0333F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 39, 0.4741F, 0.0486F, -0.0808F, 1, 1, 2, -0.004F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.3F, -0.6811F, -1.5996F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.212F, 0.3139F, 0.0333F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 39, -1.4741F, 0.0486F, -0.0808F, 1, 1, 2, -0.004F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.1F, -3.4F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -0.8F, -1.1889F, 1.5764F, 1, 1, 2, -0.004F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 26, -1.2F, -1.1889F, 1.5764F, 1, 1, 2, -0.002F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.8F, -1.6F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0087F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 9, 39, -0.8F, 0.1268F, -1.8156F, 1, 1, 2, -0.003F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 27, 39, -1.2F, 0.1268F, -1.8156F, 1, 1, 2, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.root.offsetY = -0.13F;
        this.root.offsetX = -0.06F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.3F, 0.0F, -0.7F);
        this.setRotateAngle(head, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.3F, 0.0F);
        this.root.offsetZ = 0.0F;
        this.root.offsetY = -0.05F;
        this.root.offsetX = 0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(leftPectoral, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(leftPectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(rightPectoral, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(rightPectoral, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(leftPelvic, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(leftPelvic, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(rightPelvic, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(rightPelvic, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                this.root.offsetY = -0.1F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
