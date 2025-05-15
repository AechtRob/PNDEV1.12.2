package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraVulcanodon;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelVulcanodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer toes2;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer toes3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head2_r1;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer gums1;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer rightarm5;
    private final AdvancedModelRenderer rightarm6;
    private final AdvancedModelRenderer rightarm7;
    private final AdvancedModelRenderer rightarm8;
    private final AdvancedModelRenderer thumb2_r1;
    private final AdvancedModelRenderer fingers2_r1;
    private final AdvancedModelRenderer leftarm5;
    private final AdvancedModelRenderer leftarm6;
    private final AdvancedModelRenderer leftarm7;
    private final AdvancedModelRenderer leftarm8;
    private final AdvancedModelRenderer thumb3_r1;
    private final AdvancedModelRenderer fingers3_r1;
    private ModelAnimator animator;

    public ModelVulcanodon() {
        this.textureWidth = 155;
        this.textureHeight = 155;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -9.8F, 12.1F);
        this.setRotateAngle(hips, -0.0892F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 50, -9.0F, -6.75F, 0.0F, 18, 21, 14, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.8F, 13.1F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 48, 82, -5.5F, -4.8F, -1.1F, 11, 13, 16, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.4F, 13.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 70, 0, -4.5F, -3.5F, 0.0F, 9, 10, 15, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 13.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0892F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 96, 25, -3.5F, -3.0F, 0.0F, 7, 7, 15, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6F, 14.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0475F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 118, 0, -2.5F, -2.0F, 0.0F, 5, 5, 13, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1347F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 106, 66, -1.5F, -1.0F, 0.0F, 3, 3, 16, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(10.2F, 1.9F, 3.7F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.3643F, 0.0F, -0.0873F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 0, 85, -4.5F, 0.0F, -5.0F, 7, 16, 12, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.2F, 13.3F, -2.2F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9978F, 0.0F, 0.0436F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 0, -4.0F, 0.0F, -3.5F, 6, 18, 7, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.1F, 16.7F, 0.45F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6791F, 0.0F, 0.0436F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 26, 85, -3.6F, 0.0F, -2.5F, 5, 6, 5, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 5.2F, 0.0F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.1503F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 50, 50, -4.6F, -1.3F, -3.0F, 7, 3, 5, 0.0F, false));

        this.toes2 = new AdvancedModelRenderer(this);
        this.toes2.setRotationPoint(-0.1F, 0.2F, -2.9F);
        this.leftleg4.addChild(toes2);
        this.toes2.cubeList.add(new ModelBox(toes2, 54, 111, -4.5F, -1.5F, -3.0F, 7, 3, 4, -0.01F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-10.2F, 1.9F, 3.7F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.3643F, 0.0F, 0.0873F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 85, -2.5F, 0.0F, -5.0F, 7, 16, 12, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.2F, 13.3F, -2.2F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.9978F, 0.0F, -0.0436F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 0, -2.0F, 0.0F, -3.5F, 6, 18, 7, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.1F, 16.7F, 0.45F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6791F, 0.0F, -0.0436F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 26, 85, -1.4F, 0.0F, -2.5F, 5, 6, 5, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 5.2F, 0.0F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.1503F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 50, 50, -2.4F, -1.3F, -3.0F, 7, 3, 5, 0.0F, true));

        this.toes3 = new AdvancedModelRenderer(this);
        this.toes3.setRotationPoint(0.1F, 0.2F, -2.9F);
        this.rightleg4.addChild(toes3);
        this.toes3.cubeList.add(new ModelBox(toes3, 54, 111, -2.5F, -1.5F, -3.0F, 7, 3, 4, -0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.6F, 1.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0911F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -11.0F, -9.0F, -25.0F, 22, 24, 26, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.3F, -24.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0436F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 64, 50, -8.5F, -6.0F, -11.0F, 17, 20, 12, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5236F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 91, 100, -4.5F, -4.1F, -6.0F, 9, 12, 11, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(-0.1F, 1.0F, -6.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 27, 111, -3.9F, -4.5F, -9.0F, 8, 11, 11, 0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -8.8F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 65, 112, -3.4F, -4.25F, -9.5F, 7, 10, 11, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 1.0F, -9.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1745F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 120, 85, -2.9F, -5.0F, -8.5F, 6, 9, 10, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.6F, -8.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.3927F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 86, 82, -2.4F, -4.15F, -6.75F, 5, 8, 8, -0.01F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -0.7F, -5.15F);
        this.neck5.addChild(head1);
        this.setRotateAngle(head1, 0.48F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 103, 0, -2.4F, -3.55F, -5.0F, 5, 5, 5, 0.01F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.1F, -3.75F, -5.5F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.2094F, 0.0F, 0.0F);


        this.head2_r1 = new AdvancedModelRenderer(this);
        this.head2_r1.setRotationPoint(0.1F, 38.4F, 61.6F);
        this.head2.addChild(head2_r1);
        this.setRotateAngle(head2_r1, 0.0087F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 70, 0, -1.6F, -38.5F, -64.25F, 3, 3, 4, 0.01F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 0.8F, -2.4F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.3927F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 60, 58, -1.0F, -0.5F, -2.4F, 2, 2, 2, 0.0F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.5F, -5.4F);
        this.head1.addChild(head3);
        this.setRotateAngle(head3, -0.0873F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 110, 47, -1.9F, 0.85F, -2.9F, 4, 2, 4, 0.0F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.65F, -2.5F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, -0.1745F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 70, 7, -1.4F, 0.1F, -2.1F, 3, 2, 3, 0.0F, false));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.1F, 1.45F, -1.4F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 118, 18, -2.5F, 0.0F, -3.6F, 5, 2, 5, 0.0F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(-0.1F, -2.5F, -2.9F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.2731F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 112, 85, -2.0F, 0.0F, 0.25F, 4, 3, 4, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, -0.3F, -4.9F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0873F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 19, 113, -2.0F, 0.05F, -2.2F, 4, 1, 4, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(-0.1F, -0.175F, -2.8F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1658F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 0, 60, -1.4F, 0.05F, -1.3F, 3, 1, 3, 0.0F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(-0.1F, 1.45F, 1.4F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.1047F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 50, 58, -1.4F, -0.4F, -3.8F, 3, 1, 4, 0.01F, false));

        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(-0.1F, 1.3F, -2.125F);
        this.jaw2.addChild(jaw5);
        this.setRotateAngle(jaw5, -0.4974F, 0.0F, 0.0F);
        this.jaw5.cubeList.add(new ModelBox(jaw5, 68, 58, -0.9F, -0.55F, -2.1F, 2, 1, 2, 0.0F, false));

        this.rightarm5 = new AdvancedModelRenderer(this);
        this.rightarm5.setRotationPoint(-9.5F, 9.45F, -4.05F);
        this.chest.addChild(rightarm5);
        this.rightarm5.cubeList.add(new ModelBox(rightarm5, 0, 113, -2.0F, -0.9F, -3.0F, 6, 13, 7, 0.0F, true));

        this.rightarm6 = new AdvancedModelRenderer(this);
        this.rightarm6.setRotationPoint(0.2F, 8.7F, 0.2F);
        this.rightarm5.addChild(rightarm6);
        this.setRotateAngle(rightarm6, -0.0873F, -0.0015F, 0.0262F);
        this.rightarm6.cubeList.add(new ModelBox(rightarm6, 122, 47, -1.5F, 0.5326F, -2.2479F, 5, 10, 6, 0.0F, true));

        this.rightarm7 = new AdvancedModelRenderer(this);
        this.rightarm7.setRotationPoint(1.0F, 10.6326F, 0.3771F);
        this.rightarm6.addChild(rightarm7);
        this.rightarm7.cubeList.add(new ModelBox(rightarm7, 46, 85, -1.979F, -0.8841F, -2.3677F, 4, 6, 5, 0.0F, true));

        this.rightarm8 = new AdvancedModelRenderer(this);
        this.rightarm8.setRotationPoint(0.175F, 5.0F, 1.925F);
        this.rightarm7.addChild(rightarm8);
        this.setRotateAngle(rightarm8, -1.6214F, -0.0473F, 1.5384F);


        this.thumb2_r1 = new AdvancedModelRenderer(this);
        this.thumb2_r1.setRotationPoint(0.0F, 0.3819F, -2.0021F);
        this.rightarm8.addChild(thumb2_r1);
        this.setRotateAngle(thumb2_r1, -0.6545F, 0.0F, 0.0F);
        this.thumb2_r1.cubeList.add(new ModelBox(thumb2_r1, 0, 85, -1.0129F, -0.9977F, 0.2691F, 2, 5, 2, -0.01F, true));

        this.fingers2_r1 = new AdvancedModelRenderer(this);
        this.fingers2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightarm8.addChild(fingers2_r1);
        this.setRotateAngle(fingers2_r1, 0.0873F, 0.0F, 0.0F);
        this.fingers2_r1.cubeList.add(new ModelBox(fingers2_r1, 0, 50, -1.0129F, 0.4674F, -2.253F, 2, 5, 5, -0.02F, true));

        this.leftarm5 = new AdvancedModelRenderer(this);
        this.leftarm5.setRotationPoint(9.5F, 9.45F, -4.05F);
        this.chest.addChild(leftarm5);
        this.leftarm5.cubeList.add(new ModelBox(leftarm5, 0, 113, -4.0F, -0.9F, -3.0F, 6, 13, 7, 0.0F, false));

        this.leftarm6 = new AdvancedModelRenderer(this);
        this.leftarm6.setRotationPoint(-0.2F, 8.7F, 0.2F);
        this.leftarm5.addChild(leftarm6);
        this.setRotateAngle(leftarm6, -0.0873F, 0.0015F, -0.0262F);
        this.leftarm6.cubeList.add(new ModelBox(leftarm6, 122, 47, -3.5F, 0.5326F, -2.2479F, 5, 10, 6, 0.0F, false));

        this.leftarm7 = new AdvancedModelRenderer(this);
        this.leftarm7.setRotationPoint(-1.0F, 10.6326F, 0.3771F);
        this.leftarm6.addChild(leftarm7);
        this.leftarm7.cubeList.add(new ModelBox(leftarm7, 46, 85, -2.021F, -0.8841F, -2.3677F, 4, 6, 5, 0.0F, false));

        this.leftarm8 = new AdvancedModelRenderer(this);
        this.leftarm8.setRotationPoint(-0.175F, 5.0F, 1.925F);
        this.leftarm7.addChild(leftarm8);
        this.setRotateAngle(leftarm8, -1.6214F, 0.0473F, -1.5384F);


        this.thumb3_r1 = new AdvancedModelRenderer(this);
        this.thumb3_r1.setRotationPoint(0.0F, 0.3819F, -2.0021F);
        this.leftarm8.addChild(thumb3_r1);
        this.setRotateAngle(thumb3_r1, -0.6545F, 0.0F, 0.0F);
        this.thumb3_r1.cubeList.add(new ModelBox(thumb3_r1, 0, 85, -0.9871F, -0.9977F, 0.2691F, 2, 5, 2, -0.01F, false));

        this.fingers3_r1 = new AdvancedModelRenderer(this);
        this.fingers3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftarm8.addChild(fingers3_r1);
        this.setRotateAngle(fingers3_r1, 0.0873F, 0.0F, 0.0F);
        this.fingers3_r1.cubeList.add(new ModelBox(fingers3_r1, 0, 50, -0.9871F, 0.4674F, -2.253F, 2, 5, 5, -0.02F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.55F;
        this.hips.offsetX = 0.15F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(-2);
        this.hips.rotateAngleZ = (float)Math.toRadians(2);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraVulcanodon entityVulcanodon = (EntityPrehistoricFloraVulcanodon) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, neck4);
        this.faceTarget(f3, f4, 12, neck5);
        this.faceTarget(f3, f4, 12, head1);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.head1};

        entityVulcanodon.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityVulcanodon.getAnimation() == entityVulcanodon.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.1F, 0.05F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.1F, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityVulcanodon.isReallyInWater()) {

                if (f3 == 0.0F || !entityVulcanodon.getIsMoving()) {
                    if (entityVulcanodon.getAnimation() != entityVulcanodon.EAT_ANIMATION
                        && entityVulcanodon.getAnimation() != entityVulcanodon.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.1F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityVulcanodon.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraVulcanodon ee = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 32.75 + (((tickAnim - 15) / 10) * (0-(32.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 1.1 + (((tickAnim - 15) / 10) * (0-(1.1)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 23 + (((tickAnim - 15) / 10) * (0-(23)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 16.75 + (((tickAnim - 15) / 10) * (0-(16.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.5 + (((tickAnim - 8) / 7) * (-8.25-(15.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -8.25 + (((tickAnim - 15) / 4) * (12.19-(-8.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.19 + (((tickAnim - 19) / 6) * (0-(12.19)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.85 + (((tickAnim - 8) / 7) * (0-(0.85)));
            zz = 0.775 + (((tickAnim - 8) / 7) * (0-(0.775)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0.575-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 19) / 6) * (0-(0.55)));
            zz = 0.575 + (((tickAnim - 19) / 6) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head1.rotationPointX = this.head1.rotationPointX + (float)(xx);
        this.head1.rotationPointY = this.head1.rotationPointY - (float)(yy);
        this.head1.rotationPointZ = this.head1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 19.5 + (((tickAnim - 8) / 7) * (0-(19.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));

        

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 25) / 25) * (0-(29.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 30) / 20) * (0-(11.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 18.25 + (((tickAnim - 25) / 17) * (-43.42-(18.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -43.42 + (((tickAnim - 42) / 8) * (0-(-43.42)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 17) * (1.475-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (2.125-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 1.475 + (((tickAnim - 42) / 8) * (0-(1.475)));
            zz = 2.125 + (((tickAnim - 42) / 8) * (0-(2.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (54-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 54 + (((tickAnim - 25) / 17) * (81-(54)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 81 + (((tickAnim - 42) / 8) * (0-(81)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (30.5-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 30.5 + (((tickAnim - 30) / 12) * (8.75-(30.5)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 42) / 8) * (0-(8.75)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = -0.325 + (((tickAnim - 30) / 12) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(xx);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(yy);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(zz);



    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 20) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 30) / 20) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-9.975-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -9.975 + (((tickAnim - 20) / 10) * (-9.975-(-9.975)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -9.975 + (((tickAnim - 30) / 20) * (0-(-9.975)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.75 + (((tickAnim - 20) / 10) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 30) / 20) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 10) / 10) * (10-(-6)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 20) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 30) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.63-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.63 + (((tickAnim - 10) / 10) * (15.25-(2.63)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.25 + (((tickAnim - 20) / 10) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 15.25 + (((tickAnim - 30) / 3) * (2.09-(15.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 2.09 + (((tickAnim - 33) / 4) * (-3.83-(2.09)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -3.83 + (((tickAnim - 37) / 13) * (0-(-3.83)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 20) / 10) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 5.75 + (((tickAnim - 30) / 3) * (15.78-(5.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 15.78 + (((tickAnim - 33) / 4) * (0-(15.78)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 20) / 10) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 30) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.75 + (((tickAnim - 20) / 10) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 30) / 20) * (0-(31.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 20) / 10) * (0.85-(0.85)));
            zz = -2.225 + (((tickAnim - 20) / 10) * (-2.225-(-2.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 20) * (0-(0.85)));
            zz = -2.225 + (((tickAnim - 30) / 20) * (0-(-2.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 20) / 10) * (-35-(-35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -35 + (((tickAnim - 30) / 20) * (0-(-35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.85-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 20) / 10) * (0.725-(0.725)));
            zz = 0.85 + (((tickAnim - 20) / 10) * (0.85-(0.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 20) * (0-(0.725)));
            zz = 0.85 + (((tickAnim - 30) / 20) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.75 + (((tickAnim - 20) / 10) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 30) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.525 + (((tickAnim - 20) / 10) * (1.525-(1.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.525 + (((tickAnim - 30) / 20) * (0-(1.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 20) / 10) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 30) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 31.75 + (((tickAnim - 20) / 10) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 30) / 20) * (0-(31.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.85 + (((tickAnim - 20) / 10) * (0.85-(0.85)));
            zz = -2.225 + (((tickAnim - 20) / 10) * (-2.225-(-2.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.85 + (((tickAnim - 30) / 20) * (0-(0.85)));
            zz = -2.225 + (((tickAnim - 30) / 20) * (0-(-2.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 20) / 10) * (-35-(-35)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -35 + (((tickAnim - 30) / 20) * (0-(-35)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.85-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 20) / 10) * (0.725-(0.725)));
            zz = 0.85 + (((tickAnim - 20) / 10) * (0.85-(0.85)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 20) * (0-(0.725)));
            zz = 0.85 + (((tickAnim - 30) / 20) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.75 + (((tickAnim - 20) / 10) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 30) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.525 + (((tickAnim - 20) / 10) * (1.525-(1.525)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.525 + (((tickAnim - 30) / 20) * (0-(1.525)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 20) / 10) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 30) / 20) * (0-(13.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34 + (((tickAnim - 20) / 10) * (34-(34)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 30) / 20) * (0-(34)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm5, rightarm5.rotateAngleX + (float) Math.toRadians(xx), rightarm5.rotateAngleY + (float) Math.toRadians(yy), rightarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-41.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -41.75 + (((tickAnim - 20) / 10) * (-41.75-(-41.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -41.75 + (((tickAnim - 30) / 20) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm6, rightarm6.rotateAngleX + (float) Math.toRadians(xx), rightarm6.rotateAngleY + (float) Math.toRadians(yy), rightarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 1.05 + (((tickAnim - 20) / 10) * (1.05-(1.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 1.05 + (((tickAnim - 30) / 20) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm6.rotationPointX = this.rightarm6.rotationPointX + (float)(xx);
        this.rightarm6.rotationPointY = this.rightarm6.rotationPointY - (float)(yy);
        this.rightarm6.rotationPointZ = this.rightarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -19.5 + (((tickAnim - 20) / 10) * (-19.5-(-19.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -19.5 + (((tickAnim - 30) / 20) * (0-(-19.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm8, rightarm8.rotateAngleX + (float) Math.toRadians(xx), rightarm8.rotateAngleY + (float) Math.toRadians(yy), rightarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 10) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.125 + (((tickAnim - 30) / 20) * (0-(1.125)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm8.rotationPointX = this.rightarm8.rotationPointX + (float)(xx);
        this.rightarm8.rotationPointY = this.rightarm8.rotationPointY - (float)(yy);
        this.rightarm8.rotationPointZ = this.rightarm8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34 + (((tickAnim - 20) / 10) * (34-(34)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 30) / 20) * (0-(34)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(xx), leftarm5.rotateAngleY + (float) Math.toRadians(yy), leftarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-41.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -41.75 + (((tickAnim - 20) / 10) * (-41.75-(-41.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -41.75 + (((tickAnim - 30) / 20) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(xx), leftarm6.rotateAngleY + (float) Math.toRadians(yy), leftarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.05-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 1.05 + (((tickAnim - 20) / 10) * (1.05-(1.05)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 1.05 + (((tickAnim - 30) / 20) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm6.rotationPointX = this.leftarm6.rotationPointX + (float)(xx);
        this.leftarm6.rotationPointY = this.leftarm6.rotationPointY - (float)(yy);
        this.leftarm6.rotationPointZ = this.leftarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (19.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 19.5 + (((tickAnim - 20) / 10) * (19.5-(19.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 19.5 + (((tickAnim - 30) / 20) * (0-(19.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm8, leftarm8.rotateAngleX + (float) Math.toRadians(xx), leftarm8.rotateAngleY + (float) Math.toRadians(yy), leftarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 10) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.125 + (((tickAnim - 30) / 20) * (0-(1.125)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm8.rotationPointX = this.leftarm8.rotationPointX + (float)(xx);
        this.leftarm8.rotationPointY = this.leftarm8.rotationPointY - (float)(yy);
        this.leftarm8.rotationPointZ = this.leftarm8.rotationPointZ + (float)(zz);



    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 25) / 20) * (0-(0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*3 + (((tickAnim - 25) / 20) * (0-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*3)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-140))*-2.925-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-140))*-2.925 + (((tickAnim - 25) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-140))*-2.925)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*-2.925-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*-2.925 + (((tickAnim - 25) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*-2.925)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -2.5 + (((tickAnim - 25) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = -4.25 + (((tickAnim - 25) / 20) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 9) / 16) * (20-(0)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 20 + (((tickAnim - 25) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 315;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -2.75 + (((tickAnim - 40) / 25) * (-3.25-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = -3.25 + (((tickAnim - 65) / 75) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = -2.75 + (((tickAnim - 180) / 25) * (-3.25-(-2.75)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = -3.25 + (((tickAnim - 205) / 75) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            yy = -0.125 + (((tickAnim - 40) / 140) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            yy = -0.125 + (((tickAnim - 180) / 100) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 180) / 100) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = -0.125 + (((tickAnim - 280) / 35) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0.25-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 0.25 + (((tickAnim - 65) / 75) * (6.75-(0.25)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 6.75 + (((tickAnim - 140) / 40) * (0-(6.75)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 180) / 25) * (0.25-(0)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 0.25 + (((tickAnim - 205) / 75) * (6.75-(0.25)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 6.75 + (((tickAnim - 280) / 35) * (0-(6.75)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 35) / 30) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 35) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 30) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = -0.75 + (((tickAnim - 65) / 75) * (-3.75-(-0.75)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 175) {
            xx = -3.75 + (((tickAnim - 140) / 35) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 140) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 35) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 175) / 30) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 175) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 30) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = -0.75 + (((tickAnim - 205) / 75) * (-3.75-(-0.75)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -3.75 + (((tickAnim - 280) / 35) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 35) / 30) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 35) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 30) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = -1.25 + (((tickAnim - 65) / 75) * (-9.25-(-1.25)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 175) {
            xx = -9.25 + (((tickAnim - 140) / 35) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 140) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 35) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 175) / 30) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 175) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 30) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = -1.25 + (((tickAnim - 205) / 75) * (-9.25-(-1.25)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -9.25 + (((tickAnim - 280) / 35) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 65) {
            xx = 6.25 + (((tickAnim - 35) / 30) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 35) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 30) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 5.25 + (((tickAnim - 65) / 75) * (-3.25-(5.25)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 175) {
            xx = -3.25 + (((tickAnim - 140) / 35) * (6.25-(-3.25)));
            yy = 0 + (((tickAnim - 140) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 35) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 205) {
            xx = 6.25 + (((tickAnim - 175) / 30) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 175) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 30) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 5.25 + (((tickAnim - 205) / 75) * (-3.25-(5.25)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -3.25 + (((tickAnim - 280) / 35) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 65) {
            xx = 15 + (((tickAnim - 35) / 30) * (8.75-(15)));
            yy = 0 + (((tickAnim - 35) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 30) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 8.75 + (((tickAnim - 65) / 75) * (1.75-(8.75)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 175) {
            xx = 1.75 + (((tickAnim - 140) / 35) * (15-(1.75)));
            yy = 0 + (((tickAnim - 140) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 35) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 205) {
            xx = 15 + (((tickAnim - 175) / 30) * (8.75-(15)));
            yy = 0 + (((tickAnim - 175) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 30) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 8.75 + (((tickAnim - 205) / 75) * (1.75-(8.75)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 1.75 + (((tickAnim - 280) / 35) * (0-(1.75)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 3.25 + (((tickAnim - 40) / 25) * (4-(3.25)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 4 + (((tickAnim - 65) / 75) * (0-(4)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 3.25 + (((tickAnim - 180) / 25) * (4-(3.25)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 4 + (((tickAnim - 205) / 75) * (0-(4)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 3.25 + (((tickAnim - 40) / 25) * (4-(3.25)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 4 + (((tickAnim - 65) / 75) * (0-(4)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 3.25 + (((tickAnim - 180) / 25) * (4-(3.25)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 4 + (((tickAnim - 205) / 75) * (0-(4)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -2.25 + (((tickAnim - 40) / 25) * (1.75-(-2.25)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 1.75 + (((tickAnim - 65) / 30) * (-0.75-(1.75)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -0.75 + (((tickAnim - 95) / 45) * (-9-(-0.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -9 + (((tickAnim - 140) / 40) * (-2.25-(-9)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = -2.25 + (((tickAnim - 180) / 25) * (1.75-(-2.25)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 1.75 + (((tickAnim - 205) / 30) * (-0.75-(1.75)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -0.75 + (((tickAnim - 235) / 45) * (-9-(-0.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -9 + (((tickAnim - 280) / 35) * (0-(-9)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (-1.175-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0.775 + (((tickAnim - 65) / 30) * (0.625-(0.775)));
            zz = -1.175 + (((tickAnim - 65) / 30) * (-0.225-(-1.175)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0.625 + (((tickAnim - 95) / 45) * (0-(0.625)));
            zz = -0.225 + (((tickAnim - 95) / 45) * (0-(-0.225)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 65) * (0.775-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (-1.175-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            yy = 0.775 + (((tickAnim - 205) / 30) * (0.625-(0.775)));
            zz = -1.175 + (((tickAnim - 205) / 30) * (-0.225-(-1.175)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0.625 + (((tickAnim - 235) / 45) * (0-(0.625)));
            zz = -0.225 + (((tickAnim - 235) / 45) * (0-(-0.225)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -2 + (((tickAnim - 40) / 25) * (4.5-(-2)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 4.5 + (((tickAnim - 65) / 30) * (6.25-(4.5)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 6.25 + (((tickAnim - 95) / 45) * (-5.75-(6.25)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -5.75 + (((tickAnim - 140) / 40) * (-2-(-5.75)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = -2 + (((tickAnim - 180) / 25) * (4.5-(-2)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 4.5 + (((tickAnim - 205) / 30) * (6.25-(4.5)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 6.25 + (((tickAnim - 235) / 45) * (-5.75-(6.25)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -5.75 + (((tickAnim - 280) / 35) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (-0.975-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0.375-(0)));
            zz = -0.975 + (((tickAnim - 65) / 30) * (-0.97-(-0.975)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0.375 + (((tickAnim - 95) / 45) * (0-(0.375)));
            zz = -0.97 + (((tickAnim - 95) / 45) * (0-(-0.97)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (-0.975-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 30) * (0.375-(0)));
            zz = -0.975 + (((tickAnim - 205) / 30) * (-0.97-(-0.975)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0.375 + (((tickAnim - 235) / 45) * (0-(0.375)));
            zz = -0.97 + (((tickAnim - 235) / 45) * (0-(-0.97)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0.5 + (((tickAnim - 40) / 25) * (-5.5-(0.5)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = -5.5 + (((tickAnim - 65) / 30) * (-2.75-(-5.5)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -2.75 + (((tickAnim - 95) / 45) * (-11-(-2.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -11 + (((tickAnim - 140) / 40) * (0.5-(-11)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 0.5 + (((tickAnim - 180) / 25) * (-5.5-(0.5)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = -5.5 + (((tickAnim - 205) / 30) * (-2.75-(-5.5)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -2.75 + (((tickAnim - 235) / 45) * (-11-(-2.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -11 + (((tickAnim - 280) / 35) * (0-(-11)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (-0.3-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -0.3 + (((tickAnim - 95) / 45) * (0-(-0.3)));
        }
        else if (tickAnim >= 140 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 140) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 95) * (-0.3-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -0.3 + (((tickAnim - 235) / 45) * (0-(-0.3)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 40) / 25) * (-9.25-(5)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = -9.25 + (((tickAnim - 65) / 30) * (-11.75-(-9.25)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -11.75 + (((tickAnim - 95) / 45) * (9-(-11.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 9 + (((tickAnim - 140) / 40) * (5-(9)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 5 + (((tickAnim - 180) / 25) * (-9.25-(5)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = -9.25 + (((tickAnim - 205) / 30) * (-11.75-(-9.25)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -11.75 + (((tickAnim - 235) / 45) * (9-(-11.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 9 + (((tickAnim - 280) / 35) * (0-(9)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (-0.2-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = -0.2 + (((tickAnim - 65) / 30) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -0.2 + (((tickAnim - 95) / 45) * (0-(-0.2)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (-0.2-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = -0.2 + (((tickAnim - 205) / 30) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -0.2 + (((tickAnim - 235) / 45) * (0-(-0.2)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -7.75 + (((tickAnim - 40) / 25) * (-6-(-7.75)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = -6 + (((tickAnim - 65) / 30) * (-14.75-(-6)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 125) {
            xx = -14.75 + (((tickAnim - 95) / 30) * (-5.58-(-14.75)));
            yy = 0 + (((tickAnim - 95) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 30) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -5.58 + (((tickAnim - 125) / 15) * (6.5-(-5.58)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 6.5 + (((tickAnim - 140) / 40) * (-7.75-(6.5)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = -7.75 + (((tickAnim - 180) / 25) * (-6-(-7.75)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = -6 + (((tickAnim - 205) / 30) * (-14.75-(-6)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 265) {
            xx = -14.75 + (((tickAnim - 235) / 30) * (-5.58-(-14.75)));
            yy = 0 + (((tickAnim - 235) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 30) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = -5.58 + (((tickAnim - 265) / 15) * (6.5-(-5.58)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 6.5 + (((tickAnim - 280) / 35) * (0-(6.5)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.525-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0.525 + (((tickAnim - 40) / 25) * (-0.27-(0.525)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = -0.27 + (((tickAnim - 65) / 30) * (-0.27-(-0.27)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -0.27 + (((tickAnim - 95) / 45) * (0.55-(-0.27)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0.55 + (((tickAnim - 140) / 40) * (0.525-(0.55)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0.525 + (((tickAnim - 180) / 25) * (-0.27-(0.525)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = -0.27 + (((tickAnim - 205) / 30) * (-0.27-(-0.27)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -0.27 + (((tickAnim - 235) / 45) * (0.55-(-0.27)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0.55 + (((tickAnim - 280) / 35) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -6.75 + (((tickAnim - 40) / 25) * (-16.5-(-6.75)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = -16.5 + (((tickAnim - 65) / 30) * (-18-(-16.5)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 114) {
            xx = -18 + (((tickAnim - 95) / 19) * (-2.74-(-18)));
            yy = 0 + (((tickAnim - 95) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 19) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 125) {
            xx = -2.74 + (((tickAnim - 114) / 11) * (-12.5-(-2.74)));
            yy = 0 + (((tickAnim - 114) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 11) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -12.5 + (((tickAnim - 125) / 15) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = -6.75 + (((tickAnim - 180) / 25) * (-16.5-(-6.75)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = -16.5 + (((tickAnim - 205) / 30) * (-18-(-16.5)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 254) {
            xx = -18 + (((tickAnim - 235) / 19) * (-2.74-(-18)));
            yy = 0 + (((tickAnim - 235) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 19) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 265) {
            xx = -2.74 + (((tickAnim - 254) / 11) * (-12.5-(-2.74)));
            yy = 0 + (((tickAnim - 254) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 11) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 280) {
            xx = -12.5 + (((tickAnim - 265) / 15) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 265) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 15) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (-0.475-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = -0.475 + (((tickAnim - 65) / 30) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -0.475 + (((tickAnim - 95) / 45) * (0-(-0.475)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (-0.475-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = -0.475 + (((tickAnim - 205) / 30) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -0.475 + (((tickAnim - 235) / 45) * (0-(-0.475)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head1.rotationPointX = this.head1.rotationPointX + (float)(xx);
        this.head1.rotationPointY = this.head1.rotationPointY - (float)(yy);
        this.head1.rotationPointZ = this.head1.rotationPointZ + (float)(zz);




        if (tickAnim >= 35 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 35) / 23) * (29-(0)));
            yy = 0 + (((tickAnim - 35) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 23) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 29 + (((tickAnim - 58) / 7) * (3.5-(29)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 3.5 + (((tickAnim - 65) / 30) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 114) {
            xx = 3.5 + (((tickAnim - 95) / 19) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 95) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 19) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 125) {
            xx = 3.5 + (((tickAnim - 114) / 11) * (13.25-(3.5)));
            yy = 0 + (((tickAnim - 114) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 11) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 133) {
            xx = 13.25 + (((tickAnim - 125) / 8) * (0-(13.25)));
            yy = 0 + (((tickAnim - 125) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 8) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 133) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 133) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 42) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 175) / 23) * (29-(0)));
            yy = 0 + (((tickAnim - 175) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 23) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 205) {
            xx = 29 + (((tickAnim - 198) / 7) * (3.5-(29)));
            yy = 0 + (((tickAnim - 198) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 7) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 235) {
            xx = 3.5 + (((tickAnim - 205) / 30) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 205) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 30) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 254) {
            xx = 3.5 + (((tickAnim - 235) / 19) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 235) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 19) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 265) {
            xx = 3.5 + (((tickAnim - 254) / 11) * (13.25-(3.5)));
            yy = 0 + (((tickAnim - 254) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 11) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 273) {
            xx = 13.25 + (((tickAnim - 265) / 8) * (0-(13.25)));
            yy = 0 + (((tickAnim - 265) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 4 + (((tickAnim - 40) / 25) * (4.25-(4)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 4.25 + (((tickAnim - 65) / 75) * (2.25-(4.25)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 2.25 + (((tickAnim - 140) / 40) * (4-(2.25)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 4 + (((tickAnim - 180) / 25) * (4.25-(4)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 4.25 + (((tickAnim - 205) / 75) * (2.25-(4.25)));
            yy = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 2.25 + (((tickAnim - 280) / 35) * (0-(2.25)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm5, rightarm5.rotateAngleX + (float) Math.toRadians(xx), rightarm5.rotateAngleY + (float) Math.toRadians(yy), rightarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 280) {
            xx = -12 + (((tickAnim - 140) / 140) * (-12-(-12)));
            yy = 0 + (((tickAnim - 140) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 140) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = -12 + (((tickAnim - 280) / 35) * (0-(-12)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm6, rightarm6.rotateAngleX + (float) Math.toRadians(xx), rightarm6.rotateAngleY + (float) Math.toRadians(yy), rightarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.475-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            yy = -1.475 + (((tickAnim - 40) / 100) * (-0.72-(-1.475)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            yy = -0.72 + (((tickAnim - 140) / 40) * (-1.475-(-0.72)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            yy = -1.475 + (((tickAnim - 180) / 100) * (-0.72-(-1.475)));
            zz = 0 + (((tickAnim - 180) / 100) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = -0.72 + (((tickAnim - 280) / 35) * (0-(-0.72)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm6.rotationPointX = this.rightarm6.rotationPointX + (float)(xx);
        this.rightarm6.rotationPointY = this.rightarm6.rotationPointY - (float)(yy);
        this.rightarm6.rotationPointZ = this.rightarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 280) {
            xx = 7.5 + (((tickAnim - 140) / 140) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 140) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 140) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 7.5 + (((tickAnim - 280) / 35) * (0-(7.5)));
            yy = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm7, rightarm7.rotateAngleX + (float) Math.toRadians(xx), rightarm7.rotateAngleY + (float) Math.toRadians(yy), rightarm7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 35) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 30) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 35) / 30) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            yy = -0.5 + (((tickAnim - 65) / 75) * (0.05-(-0.5)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 140) / 35) * (0-(0)));
            yy = 0.05 + (((tickAnim - 140) / 35) * (0-(0.05)));
            zz = 0 + (((tickAnim - 140) / 35) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 175) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 30) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 175) / 30) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            yy = -0.5 + (((tickAnim - 205) / 75) * (0.05-(-0.5)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 280) / 35) * (0-(0)));
            yy = 0.05 + (((tickAnim - 280) / 35) * (0-(0.05)));
            zz = 0 + (((tickAnim - 280) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm7.rotationPointX = this.rightarm7.rotationPointX + (float)(xx);
        this.rightarm7.rotationPointY = this.rightarm7.rotationPointY - (float)(yy);
        this.rightarm7.rotationPointZ = this.rightarm7.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightarm8, rightarm8.rotateAngleX + (float) Math.toRadians(0), rightarm8.rotateAngleY + (float) Math.toRadians(0), rightarm8.rotateAngleZ + (float) Math.toRadians(0));
        this.rightarm8.rotationPointX = this.rightarm8.rotationPointX + (float)(0);
        this.rightarm8.rotationPointY = this.rightarm8.rotationPointY - (float)(0);
        this.rightarm8.rotationPointZ = this.rightarm8.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = -11 + (((tickAnim - 40) / 25) * (-10-(-11)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = -10 + (((tickAnim - 65) / 75) * (-15.47997-(-10)));
            yy = 0 + (((tickAnim - 65) / 75) * (-0.23916-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (-0.28038-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -15.47997 + (((tickAnim - 140) / 40) * (-11-(-15.47997)));
            yy = -0.23916 + (((tickAnim - 140) / 40) * (0-(-0.23916)));
            zz = -0.28038 + (((tickAnim - 140) / 40) * (0-(-0.28038)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = -11 + (((tickAnim - 180) / 25) * (-10-(-11)));
            yy = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = -10 + (((tickAnim - 205) / 75) * (-15.47997-(-10)));
            yy = 0 + (((tickAnim - 205) / 75) * (-0.23916-(0)));
            zz = 0 + (((tickAnim - 205) / 75) * (-0.28038-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = -15.47997 + (((tickAnim - 280) / 18) * (10.87859-(-15.47997)));
            yy = -0.23916 + (((tickAnim - 280) / 18) * (-0.11388-(-0.23916)));
            zz = -0.28038 + (((tickAnim - 280) / 18) * (-0.13351-(-0.28038)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = 10.87859 + (((tickAnim - 298) / 17) * (0-(10.87859)));
            yy = -0.11388 + (((tickAnim - 298) / 17) * (0-(-0.11388)));
            zz = -0.13351 + (((tickAnim - 298) / 17) * (0-(-0.13351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(xx), leftarm5.rotateAngleY + (float) Math.toRadians(yy), leftarm5.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftarm5.rotationPointX = this.leftarm5.rotationPointX + (float)(0);
        this.leftarm5.rotationPointY = this.leftarm5.rotationPointY - (float)(0);
        this.leftarm5.rotationPointZ = this.leftarm5.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 19) / 21) * (-4.46472-(-27.75)));
            yy = 0 + (((tickAnim - 19) / 21) * (0.80084-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (1.37273-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -4.46472 + (((tickAnim - 40) / 100) * (-4.46472-(-4.46472)));
            yy = 0.80084 + (((tickAnim - 40) / 100) * (0.80084-(0.80084)));
            zz = 1.37273 + (((tickAnim - 40) / 100) * (1.37273-(1.37273)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -4.46472 + (((tickAnim - 140) / 40) * (-4.46472-(-4.46472)));
            yy = 0.80084 + (((tickAnim - 140) / 40) * (0.80084-(0.80084)));
            zz = 1.37273 + (((tickAnim - 140) / 40) * (1.37273-(1.37273)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = -4.46472 + (((tickAnim - 180) / 100) * (-4.46472-(-4.46472)));
            yy = 0.80084 + (((tickAnim - 180) / 100) * (0.80084-(0.80084)));
            zz = 1.37273 + (((tickAnim - 180) / 100) * (1.37273-(1.37273)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = -4.46472 + (((tickAnim - 280) / 18) * (-44.62606-(-4.46472)));
            yy = 0.80084 + (((tickAnim - 280) / 18) * (0.38135-(0.80084)));
            zz = 1.37273 + (((tickAnim - 280) / 18) * (0.65368-(1.37273)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = -44.62606 + (((tickAnim - 298) / 17) * (0-(-44.62606)));
            yy = 0.38135 + (((tickAnim - 298) / 17) * (0-(0.38135)));
            zz = 0.65368 + (((tickAnim - 298) / 17) * (0-(0.65368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(xx), leftarm6.rotateAngleY + (float) Math.toRadians(yy), leftarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-2.1-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = -2.1 + (((tickAnim - 40) / 25) * (-2.275-(-2.1)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            yy = -2.275 + (((tickAnim - 65) / 75) * (-0.945-(-2.275)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            yy = -0.945 + (((tickAnim - 140) / 40) * (-2.1-(-0.945)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 180) / 25) * (0-(0)));
            yy = -2.1 + (((tickAnim - 180) / 25) * (-2.275-(-2.1)));
            zz = 0 + (((tickAnim - 180) / 25) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 205) / 75) * (0-(0)));
            yy = -2.275 + (((tickAnim - 205) / 75) * (-0.945-(-2.275)));
            zz = 0 + (((tickAnim - 205) / 75) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 280) / 18) * (0-(0)));
            yy = -0.945 + (((tickAnim - 280) / 18) * (0.375-(-0.945)));
            zz = 0 + (((tickAnim - 280) / 18) * (1.775-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 298) / 17) * (0-(0)));
            yy = 0.375 + (((tickAnim - 298) / 17) * (0-(0.375)));
            zz = 1.775 + (((tickAnim - 298) / 17) * (0-(1.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm6.rotationPointX = this.leftarm6.rotationPointX + (float)(xx);
        this.leftarm6.rotationPointY = this.leftarm6.rotationPointY - (float)(yy);
        this.leftarm6.rotationPointZ = this.leftarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (19.01-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 19.01 + (((tickAnim - 19) / 21) * (4.5-(19.01)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 4.5 + (((tickAnim - 40) / 140) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 4.5 + (((tickAnim - 180) / 100) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 100) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = 4.5 + (((tickAnim - 280) / 18) * (35.64-(4.5)));
            yy = 0 + (((tickAnim - 280) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 18) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = 35.64 + (((tickAnim - 298) / 17) * (0-(35.64)));
            yy = 0 + (((tickAnim - 298) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 298) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm7, leftarm7.rotateAngleX + (float) Math.toRadians(xx), leftarm7.rotateAngleY + (float) Math.toRadians(yy), leftarm7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 140) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            yy = -0.525 + (((tickAnim - 180) / 100) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 180) / 100) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 280) / 18) * (0-(0)));
            yy = -0.525 + (((tickAnim - 280) / 18) * (1.25-(-0.525)));
            zz = 0 + (((tickAnim - 280) / 18) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 298) / 17) * (0-(0)));
            yy = 1.25 + (((tickAnim - 298) / 17) * (0-(1.25)));
            zz = 0 + (((tickAnim - 298) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm7.rotationPointX = this.leftarm7.rotationPointX + (float)(xx);
        this.leftarm7.rotationPointY = this.leftarm7.rotationPointY - (float)(yy);
        this.leftarm7.rotationPointZ = this.leftarm7.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (38-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 38 + (((tickAnim - 19) / 21) * (13.75-(38)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            yy = 13.75 + (((tickAnim - 40) / 140) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            yy = 13.75 + (((tickAnim - 180) / 100) * (13.75-(13.75)));
            zz = 0 + (((tickAnim - 180) / 100) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 280) / 18) * (-0.99529-(0)));
            yy = 13.75 + (((tickAnim - 280) / 18) * (39.99329-(13.75)));
            zz = 0 + (((tickAnim - 280) / 18) * (-2.17595-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = -0.99529 + (((tickAnim - 298) / 17) * (0-(-0.99529)));
            yy = 39.99329 + (((tickAnim - 298) / 17) * (0-(39.99329)));
            zz = -2.17595 + (((tickAnim - 298) / 17) * (0-(-2.17595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm8, leftarm8.rotateAngleX + (float) Math.toRadians(xx), leftarm8.rotateAngleY + (float) Math.toRadians(yy), leftarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (2.2-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 2.2 + (((tickAnim - 19) / 21) * (0.525-(2.2)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 40) / 140) * (0-(0)));
            yy = 0.525 + (((tickAnim - 40) / 140) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 40) / 140) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 180) / 100) * (0-(0)));
            yy = 0.525 + (((tickAnim - 180) / 100) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 180) / 100) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 298) {
            xx = 0 + (((tickAnim - 280) / 18) * (0-(0)));
            yy = 0.525 + (((tickAnim - 280) / 18) * (1.95-(0.525)));
            zz = 0 + (((tickAnim - 280) / 18) * (0-(0)));
        }
        else if (tickAnim >= 298 && tickAnim < 315) {
            xx = 0 + (((tickAnim - 298) / 17) * (0-(0)));
            yy = 1.95 + (((tickAnim - 298) / 17) * (0-(1.95)));
            zz = 0 + (((tickAnim - 298) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm8.rotationPointX = this.leftarm8.rotationPointX + (float)(xx);
        this.leftarm8.rotationPointY = this.leftarm8.rotationPointY - (float)(yy);
        this.leftarm8.rotationPointZ = this.leftarm8.rotationPointZ + (float)(zz);



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.75 + (((tickAnim - 0) / 10) * (-2.75-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.75 + (((tickAnim - 10) / 3) * (6.06-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 6.06 + (((tickAnim - 13) / 4) * (-15.5-(6.06)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -15.5 + (((tickAnim - 17) / 4) * (-22.5-(-15.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 21) / 9) * (-11.75-(-22.5)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 10) * (0.475-(0.6)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 10) / 5) * (1.695-(0.475)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 1.695 + (((tickAnim - 15) / 2) * (0.375-(1.695)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.375 + (((tickAnim - 17) / 4) * (0-(0.375)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0.6-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.75 + (((tickAnim - 0) / 10) * (9.25-(10.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 9.25 + (((tickAnim - 10) / 7) * (-48.25-(9.25)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -48.25 + (((tickAnim - 17) / 4) * (21-(-48.25)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 21 + (((tickAnim - 21) / 9) * (10.75-(21)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (1.2-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0.425-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 17) / 4) * (-0.225-(1.2)));
            zz = 0.425 + (((tickAnim - 17) / 4) * (0-(0.425)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.225 + (((tickAnim - 21) / 9) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.75 + (((tickAnim - 0) / 10) * (55.54-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 55.54 + (((tickAnim - 10) / 3) * (81.81-(55.54)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 81.81 + (((tickAnim - 13) / 4) * (67.5-(81.81)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 67.5 + (((tickAnim - 17) / 4) * (18.75-(67.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 18.75 + (((tickAnim - 21) / 9) * (-5.75-(18.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 10) * (0-(1.175)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.79-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.22-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 2.79 + (((tickAnim - 13) / 4) * (0.95-(2.79)));
            zz = -0.22 + (((tickAnim - 13) / 4) * (-0.475-(-0.22)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0.95 + (((tickAnim - 17) / 4) * (-1.2-(0.95)));
            zz = -0.475 + (((tickAnim - 17) / 4) * (0-(-0.475)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -1.2 + (((tickAnim - 21) / 4) * (1.075-(-1.2)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.075 + (((tickAnim - 25) / 5) * (1.175-(1.075)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7 + (((tickAnim - 0) / 5) * (-18.25-(7)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = -18.25 + (((tickAnim - 5) / 18) * (45.5-(-18.25)));
            yy = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 45.5 + (((tickAnim - 23) / 7) * (7-(45.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.25 + (((tickAnim - 0) / 5) * (-15.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = -15.75 + (((tickAnim - 5) / 18) * (-2.75-(-15.75)));
            yy = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -2.75 + (((tickAnim - 23) / 2) * (6.06-(-2.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.06 + (((tickAnim - 25) / 5) * (-10.25-(6.06)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 18) * (0.475-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 23) / 4) * (1.695-(0.475)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.695 + (((tickAnim - 27) / 3) * (0.375-(1.695)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -48.25 + (((tickAnim - 0) / 2) * (-48.25-(-48.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -48.25 + (((tickAnim - 2) / 3) * (21-(-48.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 21 + (((tickAnim - 5) / 18) * (9.25-(21)));
            yy = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 9.25 + (((tickAnim - 23) / 2) * (-40-(9.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -40 + (((tickAnim - 25) / 5) * (-48.25-(-40)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 3) * (0.8-(0.8)));
            zz = 0.525 + (((tickAnim - 0) / 3) * (0.525-(0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 3) / 2) * (0-(0.8)));
            zz = 0.525 + (((tickAnim - 3) / 2) * (0-(0.525)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (1.195-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (1.615-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.195 + (((tickAnim - 27) / 3) * (0.8-(1.195)));
            zz = 1.615 + (((tickAnim - 27) / 3) * (0.525-(1.615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 67.5 + (((tickAnim - 0) / 2) * (66.5-(67.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 66.5 + (((tickAnim - 2) / 3) * (8.75-(66.5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 8.75 + (((tickAnim - 5) / 7) * (-5.62-(8.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -5.62 + (((tickAnim - 12) / 11) * (37-(-5.62)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 37 + (((tickAnim - 23) / 2) * (87.29-(37)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 87.29 + (((tickAnim - 25) / 5) * (67.5-(87.29)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 0) / 3) * (0.95-(0.95)));
            zz = -0.475 + (((tickAnim - 0) / 3) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.95 + (((tickAnim - 3) / 2) * (-1.2-(0.95)));
            zz = -0.475 + (((tickAnim - 3) / 2) * (0-(-0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 5) / 3) * (1.205-(-1.2)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.205 + (((tickAnim - 8) / 4) * (1.3-(1.205)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.3 + (((tickAnim - 12) / 3) * (0.325-(1.3)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.325 + (((tickAnim - 15) / 15) * (0.95-(0.325)));
            zz = 0 + (((tickAnim - 15) / 15) * (-0.475-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.75 + (((tickAnim - 0) / 5) * (0-(16.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (-39-(0)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -39 + (((tickAnim - 17) / 6) * (0-(-39)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (16.75-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 5) * (0-(-0.225)));
            zz = -0.575 + (((tickAnim - 0) / 5) * (0-(-0.575)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (-0.575-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes3.rotationPointX = this.toes3.rotationPointX + (float)(xx);
        this.toes3.rotationPointY = this.toes3.rotationPointY - (float)(yy);
        this.toes3.rotationPointZ = this.toes3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.72529 + (((tickAnim - 0) / 3) * (33.47529-(28.72529)));
            yy = -1.00101 + (((tickAnim - 0) / 3) * (-1.00101-(-1.00101)));
            zz = 2.82821 + (((tickAnim - 0) / 3) * (2.82821-(2.82821)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 33.47529 + (((tickAnim - 3) / 5) * (12.11171-(33.47529)));
            yy = -1.00101 + (((tickAnim - 3) / 5) * (-3.11572-(-1.00101)));
            zz = 2.82821 + (((tickAnim - 3) / 5) * (4.10242-(2.82821)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.11171 + (((tickAnim - 8) / 6) * (-23-(12.11171)));
            yy = -3.11572 + (((tickAnim - 8) / 6) * (0-(-3.11572)));
            zz = 4.10242 + (((tickAnim - 8) / 6) * (0-(4.10242)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -23 + (((tickAnim - 14) / 16) * (28.72529-(-23)));
            yy = 0 + (((tickAnim - 14) / 16) * (-1.00101-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (2.82821-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm5, rightarm5.rotateAngleX + (float) Math.toRadians(xx), rightarm5.rotateAngleY + (float) Math.toRadians(yy), rightarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6.99313 + (((tickAnim - 0) / 3) * (-2.99313-(-6.99313)));
            yy = -0.28119 + (((tickAnim - 0) / 3) * (-0.28119-(-0.28119)));
            zz = -1.72728 + (((tickAnim - 0) / 3) * (-1.72728-(-1.72728)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -2.99313 + (((tickAnim - 3) / 6) * (-3.6465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-55-(-2.99313)));
            yy = -0.28119 + (((tickAnim - 3) / 6) * (1.43922-(-0.28119)));
            zz = -1.72728 + (((tickAnim - 3) / 6) * (-4.6102-(-1.72728)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -3.6465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-55 + (((tickAnim - 9) / 5) * (-1-(-3.6465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-55)));
            yy = 1.43922 + (((tickAnim - 9) / 5) * (0-(1.43922)));
            zz = -4.6102 + (((tickAnim - 9) / 5) * (0-(-4.6102)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -1 + (((tickAnim - 14) / 16) * (-6.99313-(-1)));
            yy = 0 + (((tickAnim - 14) / 16) * (-0.28119-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (-1.72728-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm6, rightarm6.rotateAngleX + (float) Math.toRadians(xx), rightarm6.rotateAngleY + (float) Math.toRadians(yy), rightarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.6 + (((tickAnim - 0) / 3) * (-1.525-(-1.6)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -1.525 + (((tickAnim - 3) / 6) * (1.12-(-1.525)));
            zz = 0 + (((tickAnim - 3) / 6) * (0.975-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 1.12 + (((tickAnim - 9) / 5) * (-2.2-(1.12)));
            zz = 0.975 + (((tickAnim - 9) / 5) * (0-(0.975)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -2.2 + (((tickAnim - 14) / 16) * (-1.6-(-2.2)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm6.rotationPointX = this.rightarm6.rotationPointX + (float)(xx);
        this.rightarm6.rotationPointY = this.rightarm6.rotationPointY - (float)(yy);
        this.rightarm6.rotationPointZ = this.rightarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8 + (((tickAnim - 0) / 3) * (-9.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -9.5 + (((tickAnim - 3) / 6) * (20.25-(-9.5)));
            yy = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 20.25 + (((tickAnim - 9) / 5) * (2.25-(20.25)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 14) / 16) * (-8-(2.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm7, rightarm7.rotateAngleX + (float) Math.toRadians(xx), rightarm7.rotateAngleY + (float) Math.toRadians(yy), rightarm7.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightarm7.rotationPointX = this.rightarm7.rotationPointX + (float)(0);
        this.rightarm7.rotationPointY = this.rightarm7.rotationPointY - (float)(0);
        this.rightarm7.rotationPointZ = this.rightarm7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.41905 + (((tickAnim - 0) / 3) * (-5.65404-(-3.41905)));
            yy = -29.47136 + (((tickAnim - 0) / 3) * (-46.19683-(-29.47136)));
            zz = 3.0923 + (((tickAnim - 0) / 3) * (6.64844-(3.0923)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -5.65404 + (((tickAnim - 3) / 6) * (-7.38631-(-5.65404)));
            yy = -46.19683 + (((tickAnim - 3) / 6) * (-63.32706-(-46.19683)));
            zz = 6.64844 + (((tickAnim - 3) / 6) * (9.24751-(6.64844)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -7.38631 + (((tickAnim - 9) / 5) * (0.78958-(-7.38631)));
            yy = -63.32706 + (((tickAnim - 9) / 5) * (-23.23622-(-63.32706)));
            zz = 9.24751 + (((tickAnim - 9) / 5) * (-0.53521-(9.24751)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0.78958 + (((tickAnim - 14) / 6) * (-0.61471-(0.78958)));
            yy = -23.23622 + (((tickAnim - 14) / 6) * (-5.64476-(-23.23622)));
            zz = -0.53521 + (((tickAnim - 14) / 6) * (-0.18332-(-0.53521)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.61471 + (((tickAnim - 20) / 10) * (-3.41905-(-0.61471)));
            yy = -5.64476 + (((tickAnim - 20) / 10) * (-29.47136-(-5.64476)));
            zz = -0.18332 + (((tickAnim - 20) / 10) * (3.0923-(-0.18332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm8, rightarm8.rotateAngleX + (float) Math.toRadians(xx), rightarm8.rotateAngleY + (float) Math.toRadians(yy), rightarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.1 + (((tickAnim - 0) / 3) * (-0.1-(-0.1)));
            yy = 1.025 + (((tickAnim - 0) / 3) * (2.22-(1.025)));
            zz = 0.125 + (((tickAnim - 0) / 3) * (0.13-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.1 + (((tickAnim - 3) / 3) * (-0.08-(-0.1)));
            yy = 2.22 + (((tickAnim - 3) / 3) * (3.185-(2.22)));
            zz = 0.13 + (((tickAnim - 3) / 3) * (-0.35-(0.13)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -0.08 + (((tickAnim - 6) / 3) * (-0.05-(-0.08)));
            yy = 3.185 + (((tickAnim - 6) / 3) * (2.5-(3.185)));
            zz = -0.35 + (((tickAnim - 6) / 3) * (-0.84-(-0.35)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -0.05 + (((tickAnim - 9) / 5) * (0-(-0.05)));
            yy = 2.5 + (((tickAnim - 9) / 5) * (0.65-(2.5)));
            zz = -0.84 + (((tickAnim - 9) / 5) * (0-(-0.84)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (-0.02-(0)));
            yy = 0.65 + (((tickAnim - 14) / 3) * (1.065-(0.65)));
            zz = 0 + (((tickAnim - 14) / 3) * (0.03-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.02 + (((tickAnim - 17) / 3) * (-0.04-(-0.02)));
            yy = 1.065 + (((tickAnim - 17) / 3) * (1.91-(1.065)));
            zz = 0.03 + (((tickAnim - 17) / 3) * (0.05-(0.03)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.04 + (((tickAnim - 20) / 10) * (-0.1-(-0.04)));
            yy = 1.91 + (((tickAnim - 20) / 10) * (1.025-(1.91)));
            zz = 0.05 + (((tickAnim - 20) / 10) * (0.125-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm8.rotationPointX = this.rightarm8.rotationPointX + (float)(xx);
        this.rightarm8.rotationPointY = this.rightarm8.rotationPointY - (float)(yy);
        this.rightarm8.rotationPointZ = this.rightarm8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -23.5 + (((tickAnim - 0) / 18) * (34.47529-(-23.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.00101-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.82821-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 34.47529 + (((tickAnim - 18) / 5) * (8.53671-(34.47529)));
            yy = -1.00101 + (((tickAnim - 18) / 5) * (3.11572-(-1.00101)));
            zz = 2.82821 + (((tickAnim - 18) / 5) * (-4.10242-(2.82821)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 8.53671 + (((tickAnim - 23) / 7) * (-23.5-(8.53671)));
            yy = 3.11572 + (((tickAnim - 23) / 7) * (0-(3.11572)));
            zz = -4.10242 + (((tickAnim - 23) / 7) * (0-(-4.10242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(xx), leftarm5.rotateAngleY + (float) Math.toRadians(yy), leftarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 0) / 18) * (-2.99313-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.28119-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.72728-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2.99313 + (((tickAnim - 18) / 5) * (-72.1465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55-(-2.99313)));
            yy = -0.28119 + (((tickAnim - 18) / 5) * (-1.43922-(-0.28119)));
            zz = -1.72728 + (((tickAnim - 18) / 5) * (4.6102-(-1.72728)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -72.1465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55 + (((tickAnim - 23) / 7) * (-2.5-(-72.1465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55)));
            yy = -1.43922 + (((tickAnim - 23) / 7) * (0-(-1.43922)));
            zz = 4.6102 + (((tickAnim - 23) / 7) * (0-(4.6102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(xx), leftarm6.rotateAngleY + (float) Math.toRadians(yy), leftarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -2.2 + (((tickAnim - 0) / 18) * (-1.525-(-2.2)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.525 + (((tickAnim - 18) / 5) * (0.97-(-1.525)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.975-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.97 + (((tickAnim - 23) / 7) * (-2.2-(0.97)));
            zz = 0.975 + (((tickAnim - 23) / 7) * (0-(0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm6.rotationPointX = this.leftarm6.rotationPointX + (float)(xx);
        this.leftarm6.rotationPointY = this.leftarm6.rotationPointY - (float)(yy);
        this.leftarm6.rotationPointZ = this.leftarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0.5 + (((tickAnim - 0) / 18) * (-9.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -9.5 + (((tickAnim - 18) / 5) * (20.25-(-9.5)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 20.25 + (((tickAnim - 23) / 7) * (0.5-(20.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm7, leftarm7.rotateAngleX + (float) Math.toRadians(xx), leftarm7.rotateAngleY + (float) Math.toRadians(yy), leftarm7.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftarm7.rotationPointX = this.leftarm7.rotationPointX + (float)(0);
        this.leftarm7.rotationPointY = this.leftarm7.rotationPointY - (float)(0);
        this.leftarm7.rotationPointZ = this.leftarm7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.69889 + (((tickAnim - 0) / 8) * (-0.02842-(0.69889)));
            yy = 27.73304 + (((tickAnim - 0) / 8) * (5.99323-(27.73304)));
            zz = -1.0248 + (((tickAnim - 0) / 8) * (-0.26813-(-1.0248)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -0.02842 + (((tickAnim - 8) / 10) * (-4.31306-(-0.02842)));
            yy = 5.99323 + (((tickAnim - 8) / 10) * (28.03297-(5.99323)));
            zz = -0.26813 + (((tickAnim - 8) / 10) * (-2.96047-(-0.26813)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4.31306 + (((tickAnim - 18) / 5) * (-7.38631-(-4.31306)));
            yy = 28.03297 + (((tickAnim - 18) / 5) * (63.32706-(28.03297)));
            zz = -2.96047 + (((tickAnim - 18) / 5) * (-9.24751-(-2.96047)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -7.38631 + (((tickAnim - 23) / 7) * (0.69889-(-7.38631)));
            yy = 63.32706 + (((tickAnim - 23) / 7) * (27.73304-(63.32706)));
            zz = -9.24751 + (((tickAnim - 23) / 7) * (-1.0248-(-9.24751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm8, leftarm8.rotateAngleX + (float) Math.toRadians(xx), leftarm8.rotateAngleY + (float) Math.toRadians(yy), leftarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 3) * (1.755-(0.325)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.755 + (((tickAnim - 3) / 5) * (1.575-(1.755)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (-0.1-(0)));
            yy = 1.575 + (((tickAnim - 8) / 10) * (1.095-(1.575)));
            zz = 0 + (((tickAnim - 8) / 10) * (0.13-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.1 + (((tickAnim - 18) / 4) * (-0.08-(-0.1)));
            yy = 1.095 + (((tickAnim - 18) / 4) * (2.44-(1.095)));
            zz = 0.13 + (((tickAnim - 18) / 4) * (-0.05-(0.13)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -0.08 + (((tickAnim - 22) / 1) * (-0.05-(-0.08)));
            yy = 2.44 + (((tickAnim - 22) / 1) * (2.5-(2.44)));
            zz = -0.05 + (((tickAnim - 22) / 1) * (-0.84-(-0.05)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.05 + (((tickAnim - 23) / 7) * (0-(-0.05)));
            yy = 2.5 + (((tickAnim - 23) / 7) * (0.325-(2.5)));
            zz = -0.84 + (((tickAnim - 23) / 7) * (0-(-0.84)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm8.rotationPointX = this.leftarm8.rotationPointX + (float)(xx);
        this.leftarm8.rotationPointY = this.leftarm8.rotationPointY - (float)(yy);
        this.leftarm8.rotationPointZ = this.leftarm8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 5.75 + (((tickAnim - 0) / 10) * (45.5-(5.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 45.5 + (((tickAnim - 10) / 11) * (-18.25-(45.5)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -18.25 + (((tickAnim - 21) / 9) * (5.75-(-18.25)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (16.75-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 16.75 + (((tickAnim - 17) / 4) * (0-(16.75)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (-0.575-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = -0.225 + (((tickAnim - 17) / 4) * (0-(-0.225)));
            zz = -0.575 + (((tickAnim - 17) / 4) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(xx);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(yy);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-2.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-30))*1);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*-3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*-3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*3), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-230))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-260))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-350))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-300))*-4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-400))*1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*2), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-450))*-1));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(0), head1.rotateAngleY + (float) Math.toRadians(0), head1.rotateAngleZ + (float) Math.toRadians(0));

       

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraVulcanodon entity = (EntityPrehistoricFloraVulcanodon) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -11.75 + (((tickAnim - 0) / 15) * (-2.75-(-11.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -2.75 + (((tickAnim - 15) / 3) * (6.06-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 6.06 + (((tickAnim - 18) / 8) * (-15.5-(6.06)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -15.5 + (((tickAnim - 26) / 6) * (-15.75-(-15.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -15.75 + (((tickAnim - 32) / 13) * (-11.75-(-15.75)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 15) * (0.475-(0.6)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 15) / 8) * (1.695-(0.475)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 1.695 + (((tickAnim - 23) / 3) * (0.375-(1.695)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 26) / 6) * (0-(0.375)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 13) * (0.6-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 0) / 15) * (9.25-(10.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 9.25 + (((tickAnim - 15) / 11) * (-48.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -48.25 + (((tickAnim - 26) / 6) * (13.75-(-48.25)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 13.75 + (((tickAnim - 32) / 13) * (10.75-(13.75)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 11) * (1.2-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0.425-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 1.2 + (((tickAnim - 26) / 6) * (0-(1.2)));
            zz = 0.425 + (((tickAnim - 26) / 6) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -5.75 + (((tickAnim - 0) / 15) * (55.54-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 55.54 + (((tickAnim - 15) / 5) * (81.81-(55.54)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 81.81 + (((tickAnim - 20) / 6) * (67.5-(81.81)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 67.5 + (((tickAnim - 26) / 6) * (15-(67.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 15 + (((tickAnim - 32) / 13) * (-5.75-(15)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 15) * (0-(1.175)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (2.79-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-0.22-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 2.79 + (((tickAnim - 20) / 6) * (0.95-(2.79)));
            zz = -0.22 + (((tickAnim - 20) / 6) * (-0.475-(-0.22)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0.95 + (((tickAnim - 26) / 6) * (-0.175-(0.95)));
            zz = -0.475 + (((tickAnim - 26) / 6) * (0-(-0.475)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 32) / 6) * (1.75-(-0.175)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 1.75 + (((tickAnim - 38) / 7) * (1.175-(1.75)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7 + (((tickAnim - 0) / 8) * (-14.5-(7)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = -14.5 + (((tickAnim - 8) / 27) * (33.75-(-14.5)));
            yy = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 27) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 33.75 + (((tickAnim - 35) / 10) * (7-(33.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.25 + (((tickAnim - 0) / 8) * (-15.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = -15.75 + (((tickAnim - 8) / 27) * (-2.75-(-15.75)));
            yy = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 27) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -2.75 + (((tickAnim - 35) / 3) * (6.06-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 6.06 + (((tickAnim - 38) / 7) * (-10.25-(6.06)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 8) * (0-(0.375)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 27) * (0.475-(0)));
            zz = 0 + (((tickAnim - 8) / 27) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0.475 + (((tickAnim - 35) / 6) * (1.695-(0.475)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            yy = 1.695 + (((tickAnim - 41) / 4) * (0.375-(1.695)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -48.25 + (((tickAnim - 0) / 3) * (-48.25-(-48.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -48.25 + (((tickAnim - 3) / 5) * (13.75-(-48.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = 13.75 + (((tickAnim - 8) / 27) * (9.25-(13.75)));
            yy = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 27) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 9.25 + (((tickAnim - 35) / 3) * (-40-(9.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -40 + (((tickAnim - 38) / 7) * (-48.25-(-40)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 3) * (0.8-(0.8)));
            zz = 0.525 + (((tickAnim - 0) / 3) * (0.525-(0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 3) / 5) * (0-(0.8)));
            zz = 0.525 + (((tickAnim - 3) / 5) * (0-(0.525)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 27) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 6) * (1.195-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (1.615-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            yy = 1.195 + (((tickAnim - 41) / 4) * (0.8-(1.195)));
            zz = 1.615 + (((tickAnim - 41) / 4) * (0.525-(1.615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67.5 + (((tickAnim - 0) / 3) * (67.5-(67.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 67.5 + (((tickAnim - 3) / 5) * (14-(67.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 14 + (((tickAnim - 8) / 10) * (-5.62-(14)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -5.62 + (((tickAnim - 18) / 17) * (37-(-5.62)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 37 + (((tickAnim - 35) / 3) * (87.29-(37)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 87.29 + (((tickAnim - 38) / 7) * (67.5-(87.29)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 0) / 3) * (0.95-(0.95)));
            zz = -0.475 + (((tickAnim - 0) / 3) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 3) / 5) * (0-(0.95)));
            zz = -0.475 + (((tickAnim - 3) / 5) * (0-(-0.475)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1.205-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.205 + (((tickAnim - 13) / 5) * (1.3-(1.205)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 18) / 5) * (0.325-(1.3)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.325 + (((tickAnim - 23) / 22) * (0.95-(0.325)));
            zz = 0 + (((tickAnim - 23) / 22) * (-0.475-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (0-(16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-39-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -39 + (((tickAnim - 25) / 10) * (0-(-39)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (16.75-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 8) * (0-(-0.225)));
            zz = -0.575 + (((tickAnim - 0) / 8) * (0-(-0.575)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 27) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (-0.575-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes3.rotationPointX = this.toes3.rotationPointX + (float)(xx);
        this.toes3.rotationPointY = this.toes3.rotationPointY - (float)(yy);
        this.toes3.rotationPointZ = this.toes3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.47529 + (((tickAnim - 0) / 5) * (31.47529-(25.47529)));
            yy = -1.00101 + (((tickAnim - 0) / 5) * (-1.00101-(-1.00101)));
            zz = 2.82821 + (((tickAnim - 0) / 5) * (2.82821-(2.82821)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 31.47529 + (((tickAnim - 5) / 7) * (10.11171-(31.47529)));
            yy = -1.00101 + (((tickAnim - 5) / 7) * (-3.11572-(-1.00101)));
            zz = 2.82821 + (((tickAnim - 5) / 7) * (4.10242-(2.82821)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 10.11171 + (((tickAnim - 12) / 10) * (-18.5-(10.11171)));
            yy = -3.11572 + (((tickAnim - 12) / 10) * (0-(-3.11572)));
            zz = 4.10242 + (((tickAnim - 12) / 10) * (0-(4.10242)));
        }
        else if (tickAnim >= 22 && tickAnim < 45) {
            xx = -18.5 + (((tickAnim - 22) / 23) * (25.47529-(-18.5)));
            yy = 0 + (((tickAnim - 22) / 23) * (-1.00101-(0)));
            zz = 0 + (((tickAnim - 22) / 23) * (2.82821-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm5, rightarm5.rotateAngleX + (float) Math.toRadians(xx), rightarm5.rotateAngleY + (float) Math.toRadians(yy), rightarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -6.99313 + (((tickAnim - 0) / 5) * (-2.99313-(-6.99313)));
            yy = -0.28119 + (((tickAnim - 0) / 5) * (-0.28119-(-0.28119)));
            zz = -1.72728 + (((tickAnim - 0) / 5) * (-1.72728-(-1.72728)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -2.99313 + (((tickAnim - 5) / 8) * (13.6035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-55-(-2.99313)));
            yy = -0.28119 + (((tickAnim - 5) / 8) * (1.43922-(-0.28119)));
            zz = -1.72728 + (((tickAnim - 5) / 8) * (-4.6102-(-1.72728)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 13.6035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-55 + (((tickAnim - 13) / 9) * (-5-(13.6035+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-55)));
            yy = 1.43922 + (((tickAnim - 13) / 9) * (0-(1.43922)));
            zz = -4.6102 + (((tickAnim - 13) / 9) * (0-(-4.6102)));
        }
        else if (tickAnim >= 22 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 22) / 23) * (-6.99313-(-5)));
            yy = 0 + (((tickAnim - 22) / 23) * (-0.28119-(0)));
            zz = 0 + (((tickAnim - 22) / 23) * (-1.72728-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm6, rightarm6.rotateAngleX + (float) Math.toRadians(xx), rightarm6.rotateAngleY + (float) Math.toRadians(yy), rightarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.6 + (((tickAnim - 0) / 5) * (-1.525-(-1.6)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -1.525 + (((tickAnim - 5) / 8) * (1.12-(-1.525)));
            zz = 0 + (((tickAnim - 5) / 8) * (0.975-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 1.12 + (((tickAnim - 13) / 9) * (-2.2-(1.12)));
            zz = 0.975 + (((tickAnim - 13) / 9) * (0-(0.975)));
        }
        else if (tickAnim >= 22 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 22) / 23) * (0-(0)));
            yy = -2.2 + (((tickAnim - 22) / 23) * (-1.6-(-2.2)));
            zz = 0 + (((tickAnim - 22) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm6.rotationPointX = this.rightarm6.rotationPointX + (float)(xx);
        this.rightarm6.rotationPointY = this.rightarm6.rotationPointY - (float)(yy);
        this.rightarm6.rotationPointZ = this.rightarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (-9.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -9.5 + (((tickAnim - 5) / 8) * (20.25-(-9.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 20.25 + (((tickAnim - 13) / 9) * (0-(20.25)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 22) / 23) * (-8-(0)));
            yy = 0 + (((tickAnim - 22) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm7, rightarm7.rotateAngleX + (float) Math.toRadians(xx), rightarm7.rotateAngleY + (float) Math.toRadians(yy), rightarm7.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightarm7.rotationPointX = this.rightarm7.rotationPointX + (float)(0);
        this.rightarm7.rotationPointY = this.rightarm7.rotationPointY - (float)(0);
        this.rightarm7.rotationPointZ = this.rightarm7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.41905 + (((tickAnim - 0) / 5) * (-5.65404-(-3.41905)));
            yy = -29.47136 + (((tickAnim - 0) / 5) * (-46.19683-(-29.47136)));
            zz = 3.0923 + (((tickAnim - 0) / 5) * (6.64844-(3.0923)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -5.65404 + (((tickAnim - 5) / 8) * (-7.38631-(-5.65404)));
            yy = -46.19683 + (((tickAnim - 5) / 8) * (-63.32706-(-46.19683)));
            zz = 6.64844 + (((tickAnim - 5) / 8) * (9.24751-(6.64844)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -7.38631 + (((tickAnim - 13) / 9) * (0.78958-(-7.38631)));
            yy = -63.32706 + (((tickAnim - 13) / 9) * (-23.23622-(-63.32706)));
            zz = 9.24751 + (((tickAnim - 13) / 9) * (-0.53521-(9.24751)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0.78958 + (((tickAnim - 22) / 9) * (-0.61471-(0.78958)));
            yy = -23.23622 + (((tickAnim - 22) / 9) * (-5.64476-(-23.23622)));
            zz = -0.53521 + (((tickAnim - 22) / 9) * (-0.18332-(-0.53521)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -0.61471 + (((tickAnim - 31) / 14) * (-3.41905-(-0.61471)));
            yy = -5.64476 + (((tickAnim - 31) / 14) * (-29.47136-(-5.64476)));
            zz = -0.18332 + (((tickAnim - 31) / 14) * (3.0923-(-0.18332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm8, rightarm8.rotateAngleX + (float) Math.toRadians(xx), rightarm8.rotateAngleY + (float) Math.toRadians(yy), rightarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.1 + (((tickAnim - 0) / 5) * (-0.1-(-0.1)));
            yy = 1.025 + (((tickAnim - 0) / 5) * (2.22-(1.025)));
            zz = 0.125 + (((tickAnim - 0) / 5) * (0.13-(0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -0.1 + (((tickAnim - 5) / 4) * (-0.08-(-0.1)));
            yy = 2.22 + (((tickAnim - 5) / 4) * (3.185-(2.22)));
            zz = 0.13 + (((tickAnim - 5) / 4) * (-0.35-(0.13)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.08 + (((tickAnim - 9) / 4) * (-0.05-(-0.08)));
            yy = 3.185 + (((tickAnim - 9) / 4) * (2.5-(3.185)));
            zz = -0.35 + (((tickAnim - 9) / 4) * (-0.84-(-0.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = -0.05 + (((tickAnim - 13) / 9) * (0-(-0.05)));
            yy = 2.5 + (((tickAnim - 13) / 9) * (0.65-(2.5)));
            zz = -0.84 + (((tickAnim - 13) / 9) * (0-(-0.84)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (-0.02-(0)));
            yy = 0.65 + (((tickAnim - 22) / 3) * (1.065-(0.65)));
            zz = 0 + (((tickAnim - 22) / 3) * (0.03-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -0.02 + (((tickAnim - 25) / 6) * (-0.04-(-0.02)));
            yy = 1.065 + (((tickAnim - 25) / 6) * (1.91-(1.065)));
            zz = 0.03 + (((tickAnim - 25) / 6) * (0.05-(0.03)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -0.04 + (((tickAnim - 31) / 14) * (-0.1-(-0.04)));
            yy = 1.91 + (((tickAnim - 31) / 14) * (1.025-(1.91)));
            zz = 0.05 + (((tickAnim - 31) / 14) * (0.125-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm8.rotationPointX = this.rightarm8.rotationPointX + (float)(xx);
        this.rightarm8.rotationPointY = this.rightarm8.rotationPointY - (float)(yy);
        this.rightarm8.rotationPointZ = this.rightarm8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -18.5 + (((tickAnim - 0) / 28) * (29.72529-(-18.5)));
            yy = 0 + (((tickAnim - 0) / 28) * (-1.00101-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (2.82821-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 29.72529 + (((tickAnim - 28) / 8) * (7.33671-(29.72529)));
            yy = -1.00101 + (((tickAnim - 28) / 8) * (3.11572-(-1.00101)));
            zz = 2.82821 + (((tickAnim - 28) / 8) * (-4.10242-(2.82821)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 7.33671 + (((tickAnim - 36) / 9) * (-18.5-(7.33671)));
            yy = 3.11572 + (((tickAnim - 36) / 9) * (0-(3.11572)));
            zz = -4.10242 + (((tickAnim - 36) / 9) * (0-(-4.10242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm5, leftarm5.rotateAngleX + (float) Math.toRadians(xx), leftarm5.rotateAngleY + (float) Math.toRadians(yy), leftarm5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 0) / 28) * (-2.99313-(-5)));
            yy = 0 + (((tickAnim - 0) / 28) * (-0.28119-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-1.72728-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -2.99313 + (((tickAnim - 28) / 8) * (-1.3965+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55-(-2.99313)));
            yy = -0.28119 + (((tickAnim - 28) / 8) * (-1.43922-(-0.28119)));
            zz = -1.72728 + (((tickAnim - 28) / 8) * (4.6102-(-1.72728)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -1.3965+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55 + (((tickAnim - 36) / 9) * (-5-(-1.3965+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55)));
            yy = -1.43922 + (((tickAnim - 36) / 9) * (0-(-1.43922)));
            zz = 4.6102 + (((tickAnim - 36) / 9) * (0-(4.6102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm6, leftarm6.rotateAngleX + (float) Math.toRadians(xx), leftarm6.rotateAngleY + (float) Math.toRadians(yy), leftarm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = -2.2 + (((tickAnim - 0) / 28) * (-1.525-(-2.2)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -1.525 + (((tickAnim - 28) / 8) * (0.97-(-1.525)));
            zz = 0 + (((tickAnim - 28) / 8) * (0.975-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            yy = 0.97 + (((tickAnim - 36) / 9) * (-2.2-(0.97)));
            zz = 0.975 + (((tickAnim - 36) / 9) * (0-(0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm6.rotationPointX = this.leftarm6.rotationPointX + (float)(xx);
        this.leftarm6.rotationPointY = this.leftarm6.rotationPointY - (float)(yy);
        this.leftarm6.rotationPointZ = this.leftarm6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -9.5 + (((tickAnim - 28) / 8) * (20.25-(-9.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 20.25 + (((tickAnim - 36) / 9) * (0-(20.25)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm7, leftarm7.rotateAngleX + (float) Math.toRadians(xx), leftarm7.rotateAngleY + (float) Math.toRadians(yy), leftarm7.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftarm7.rotationPointX = this.leftarm7.rotationPointX + (float)(0);
        this.leftarm7.rotationPointY = this.leftarm7.rotationPointY - (float)(0);
        this.leftarm7.rotationPointZ = this.leftarm7.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.85034 + (((tickAnim - 0) / 13) * (-0.02842-(0.85034)));
            yy = 19.48868 + (((tickAnim - 0) / 13) * (5.99323-(19.48868)));
            zz = -0.6841 + (((tickAnim - 0) / 13) * (-0.26813-(-0.6841)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -0.02842 + (((tickAnim - 13) / 15) * (-4.31306-(-0.02842)));
            yy = 5.99323 + (((tickAnim - 13) / 15) * (28.03297-(5.99323)));
            zz = -0.26813 + (((tickAnim - 13) / 15) * (-2.96047-(-0.26813)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -4.31306 + (((tickAnim - 28) / 8) * (-7.38631-(-4.31306)));
            yy = 28.03297 + (((tickAnim - 28) / 8) * (63.32706-(28.03297)));
            zz = -2.96047 + (((tickAnim - 28) / 8) * (-9.24751-(-2.96047)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -7.38631 + (((tickAnim - 36) / 9) * (0.85034-(-7.38631)));
            yy = 63.32706 + (((tickAnim - 36) / 9) * (19.48868-(63.32706)));
            zz = -9.24751 + (((tickAnim - 36) / 9) * (-0.6841-(-9.24751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm8, leftarm8.rotateAngleX + (float) Math.toRadians(xx), leftarm8.rotateAngleY + (float) Math.toRadians(yy), leftarm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 5) * (1.755-(0.325)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 1.755 + (((tickAnim - 5) / 8) * (1.575-(1.755)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (-0.1-(0)));
            yy = 1.575 + (((tickAnim - 13) / 15) * (1.095-(1.575)));
            zz = 0 + (((tickAnim - 13) / 15) * (0.13-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -0.1 + (((tickAnim - 28) / 5) * (-0.08-(-0.1)));
            yy = 1.095 + (((tickAnim - 28) / 5) * (2.44-(1.095)));
            zz = 0.13 + (((tickAnim - 28) / 5) * (-0.05-(0.13)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -0.08 + (((tickAnim - 33) / 3) * (-0.05-(-0.08)));
            yy = 2.44 + (((tickAnim - 33) / 3) * (2.5-(2.44)));
            zz = -0.05 + (((tickAnim - 33) / 3) * (-0.84-(-0.05)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -0.05 + (((tickAnim - 36) / 9) * (0-(-0.05)));
            yy = 2.5 + (((tickAnim - 36) / 9) * (0.325-(2.5)));
            zz = -0.84 + (((tickAnim - 36) / 9) * (0-(-0.84)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm8.rotationPointX = this.leftarm8.rotationPointX + (float)(xx);
        this.leftarm8.rotationPointY = this.leftarm8.rotationPointY - (float)(yy);
        this.leftarm8.rotationPointZ = this.leftarm8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 0) / 15) * (33.75-(5.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 33.75 + (((tickAnim - 15) / 17) * (-14.5-(33.75)));
            yy = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -14.5 + (((tickAnim - 32) / 13) * (5.75-(-14.5)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (16.75-(0)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 16.75 + (((tickAnim - 26) / 6) * (0-(16.75)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 11) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (-0.575-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 26) / 6) * (0-(-0.225)));
            zz = -0.575 + (((tickAnim - 26) / 6) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(xx);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(yy);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*1.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-90))*-1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-30))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-30))*0.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5))*-2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-50))*-1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-100))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-100))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-150))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-200))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-200))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-250))*8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-50))*-1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-100))*-1.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-150))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-200))*-1.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-200))*-2.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-250))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-230))*2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-300))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-260))*2.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-350))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-300))*-2.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-400))*0.5));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-350))*1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-450))*-0.5));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(0), head1.rotateAngleY + (float) Math.toRadians(0), head1.rotateAngleZ + (float) Math.toRadians(0));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraVulcanodon e = (EntityPrehistoricFloraVulcanodon) entity;
        animator.update(entity);


    }
}
