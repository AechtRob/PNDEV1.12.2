package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMussaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelMussaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended basin;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended upperleg1;
    private final AdvancedModelRendererExtended lowerleg1;
    private final AdvancedModelRendererExtended feet1;
    private final AdvancedModelRendererExtended toes1;
    private final AdvancedModelRendererExtended upperleg2;
    private final AdvancedModelRendererExtended lowerleg2;
    private final AdvancedModelRendererExtended feet2;
    private final AdvancedModelRendererExtended toes2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended upperarm1;
    private final AdvancedModelRendererExtended arms1;
    private final AdvancedModelRendererExtended hands1;
    private final AdvancedModelRendererExtended thumbclaw1;
    private final AdvancedModelRendererExtended upperarm2;
    private final AdvancedModelRendererExtended arms2;
    private final AdvancedModelRendererExtended hands2;
    private final AdvancedModelRendererExtended thumbclaw2;

    private ModelAnimator animator;

    public ModelMussaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new AdvancedModelRendererExtended(this);
        this.basin.setRotationPoint(0.0F, -1.3F, 6.6F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 0, 63, -4.5F, -4.8F, -5.3F, 9, 13, 11, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 0.3F, 4.6F);
        this.basin.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 48, 21, -3.5F, -4.8F, -0.1F, 7, 10, 15, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -2.1F, 13.3F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -2.5F, -2.5F, -1.7F, 5, 7, 19, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 15.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1367F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 47, -2.0F, -1.8F, -0.2F, 4, 5, 18, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.4F, 16.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1367F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 41, 71, -1.5F, -1.6F, 0.3F, 3, 3, 13, 0.0F, false));

        this.upperleg1 = new AdvancedModelRendererExtended(this);
        this.upperleg1.setRotationPoint(3.5F, 0.1F, -0.2F);
        this.basin.addChild(upperleg1);
        this.setRotateAngle(upperleg1, -0.5009F, 0.0F, 0.0F);
        this.upperleg1.cubeList.add(new ModelBox(upperleg1, 78, 0, -1.5F, -1.6F, -2.6F, 5, 13, 8, 0.0F, false));

        this.lowerleg1 = new AdvancedModelRendererExtended(this);
        this.lowerleg1.setRotationPoint(0.6F, 11.0F, -1.4F);
        this.upperleg1.addChild(lowerleg1);
        this.setRotateAngle(lowerleg1, 0.9105F, 0.0F, 0.0F);
        this.lowerleg1.cubeList.add(new ModelBox(lowerleg1, 0, 0, -1.6F, 0.0F, -0.5F, 4, 12, 5, 0.0F, false));

        this.feet1 = new AdvancedModelRendererExtended(this);
        this.feet1.setRotationPoint(-0.3F, 12.0F, 4.5F);
        this.lowerleg1.addChild(feet1);
        this.setRotateAngle(feet1, -0.5918F, 0.0F, 0.0F);
        this.feet1.cubeList.add(new ModelBox(feet1, 30, 36, -0.8F, -0.3F, -4.3F, 3, 7, 4, 0.0F, false));

        this.toes1 = new AdvancedModelRendererExtended(this);
        this.toes1.setRotationPoint(0.0F, 5.4F, -2.5F);
        this.feet1.addChild(toes1);
        this.setRotateAngle(toes1, 0.2276F, 0.0F, 0.0F);
        this.toes1.cubeList.add(new ModelBox(toes1, 58, 47, -1.3F, -0.3258F, -6.0256F, 4, 3, 8, 0.0F, false));

        this.upperleg2 = new AdvancedModelRendererExtended(this);
        this.upperleg2.setRotationPoint(-3.5F, 0.1F, -0.2F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.5009F, 0.0F, 0.0F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 78, 0, -3.5F, -1.6F, -2.6F, 5, 13, 8, 0.0F, true));

        this.lowerleg2 = new AdvancedModelRendererExtended(this);
        this.lowerleg2.setRotationPoint(-0.6F, 11.0F, -1.4F);
        this.upperleg2.addChild(lowerleg2);
        this.setRotateAngle(lowerleg2, 0.9105F, 0.0F, 0.0F);
        this.lowerleg2.cubeList.add(new ModelBox(lowerleg2, 0, 0, -2.4F, 0.0F, -0.5F, 4, 12, 5, 0.0F, true));

        this.feet2 = new AdvancedModelRendererExtended(this);
        this.feet2.setRotationPoint(0.3F, 12.0F, 4.5F);
        this.lowerleg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.5918F, 0.0F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 30, 36, -2.2F, -0.3F, -4.3F, 3, 7, 4, 0.0F, true));

        this.toes2 = new AdvancedModelRendererExtended(this);
        this.toes2.setRotationPoint(0.0F, 5.4F, -2.5F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 0.2276F, 0.0F, 0.0F);
        this.toes2.cubeList.add(new ModelBox(toes2, 58, 47, -2.7F, -0.3258F, -6.0256F, 4, 3, 8, 0.0F, true));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(-0.1F, -0.1F, -5.1F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.9F, -4.7F, -20.0F, 10, 14, 21, 0.01F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -19.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0456F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 66, 61, -3.9F, -4.5F, -10.0F, 8, 12, 10, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.1F, -0.7F, -8.1F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1367F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 42, 0, -2.5F, -3.4F, -10.9F, 5, 6, 11, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.2F, -8.6F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2827F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 83, 37, -2.0F, -3.0F, -10.0F, 4, 5, 10, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -9.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 78, 22, -1.5F, -3.0F, -7.5F, 3, 4, 8, -0.01F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -3.0F, -7.5F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.6868F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 83, 53, -1.5F, 0.0F, -4.0F, 3, 3, 4, 0.0F, false));
        this.head1.cubeList.add(new ModelBox(head1, 0, 0, -0.5F, 2.0F, -8.0F, 1, 1, 1, 0.0F, false));
        this.head1.cubeList.add(new ModelBox(head1, 42, 0, -1.0F, 1.0F, -7.0F, 2, 2, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 2.0F, -8.0F);
        this.head1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.829F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -8.0F);
        this.head1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 48, -0.5F, -1.2F, 1.58F, 1, 1, 3, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(-0.1F, 3.0F, 0.0F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 30, 48, -1.4F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 0, 18, -0.4F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 42, 6, -0.9F, 0.0F, -7.0F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.jaw1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 48, -0.9F, -0.97F, 0.0F, 2, 1, 5, -0.03F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 71, -1.4F, -3.0F, 0.0F, 3, 3, 3, -0.02F, false));

        this.upperarm1 = new AdvancedModelRendererExtended(this);
        this.upperarm1.setRotationPoint(4.8F, 5.6F, -6.2F);
        this.chest.addChild(upperarm1);
        this.setRotateAngle(upperarm1, 1.0016F, 0.0F, 0.0F);
        this.upperarm1.cubeList.add(new ModelBox(upperarm1, 0, 36, -1.6F, -1.0F, -2.0F, 3, 7, 4, 0.0F, false));

        this.arms1 = new AdvancedModelRendererExtended(this);
        this.arms1.setRotationPoint(-0.2F, 6.0F, 2.0F);
        this.upperarm1.addChild(arms1);
        this.setRotateAngle(arms1, 0.6829F, 0.0F, 0.0F);
        this.arms1.cubeList.add(new ModelBox(arms1, 66, 84, -0.9F, -4.0F, -8.0F, 2, 4, 8, 0.0F, false));

        this.hands1 = new AdvancedModelRendererExtended(this);
        this.hands1.setRotationPoint(1.1F, -2.0F, -7.9F);
        this.arms1.addChild(hands1);
        this.setRotateAngle(hands1, 0.0F, 0.4363F, 0.0F);
        this.hands1.cubeList.add(new ModelBox(hands1, 64, 0, -1.0F, -2.0F, -5.0F, 1, 4, 5, 0.01F, false));

        this.thumbclaw1 = new AdvancedModelRendererExtended(this);
        this.thumbclaw1.setRotationPoint(-0.8F, -1.8F, -1.4F);
        this.hands1.addChild(thumbclaw1);
        this.setRotateAngle(thumbclaw1, -0.7741F, 0.0F, 0.0F);
        this.thumbclaw1.cubeList.add(new ModelBox(thumbclaw1, 58, 59, -0.3F, -0.6F, -2.6F, 1, 2, 3, 0.0F, false));

        this.upperarm2 = new AdvancedModelRendererExtended(this);
        this.upperarm2.setRotationPoint(-4.6F, 5.6F, -6.2F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 1.0016F, 0.0F, 0.0F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 0, 36, -1.4F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

        this.arms2 = new AdvancedModelRendererExtended(this);
        this.arms2.setRotationPoint(0.2F, 6.0F, 2.0F);
        this.upperarm2.addChild(arms2);
        this.setRotateAngle(arms2, 0.6829F, 0.0F, 0.0F);
        this.arms2.cubeList.add(new ModelBox(arms2, 66, 84, -1.1F, -4.0F, -8.0F, 2, 4, 8, 0.0F, true));

        this.hands2 = new AdvancedModelRendererExtended(this);
        this.hands2.setRotationPoint(-1.1F, -2.0F, -7.9F);
        this.arms2.addChild(hands2);
        this.setRotateAngle(hands2, 0.0F, -0.4363F, 0.0F);
        this.hands2.cubeList.add(new ModelBox(hands2, 64, 0, 0.0F, -2.0F, -5.0F, 1, 4, 5, 0.01F, true));

        this.thumbclaw2 = new AdvancedModelRendererExtended(this);
        this.thumbclaw2.setRotationPoint(0.8F, -1.8F, -1.4F);
        this.hands2.addChild(thumbclaw2);
        this.setRotateAngle(thumbclaw2, -0.7741F, 0.0F, 0.0F);
        this.thumbclaw2.cubeList.add(new ModelBox(thumbclaw2, 58, 59, -0.7F, -0.6F, -2.6F, 1, 2, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.chest.offsetY = -0.03F;
        this.neck1.rotateAngleY = (float) Math.toRadians(-10);
        this.neck2.rotateAngleY = (float) Math.toRadians(-4.8);
        this.neck3.rotateAngleX = (float) Math.toRadians(-20);
        this.head1.rotateAngleX = (float) Math.toRadians(14.3);
        this.jaw1.rotateAngleX = (float) Math.toRadians(12.5);
        this.upperarm1.rotateAngleX = (float) Math.toRadians(47.3);
        this.arms1.rotateAngleX = (float) Math.toRadians(1.6);
        this.hands1.rotateAngleX = (float) Math.toRadians(45);
        this.upperarm2.rotateAngleX = (float) Math.toRadians(42.3);
        this.chest.render(0.01F);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.3054F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.1314F, 0.0865F, -0.1F);
        this.setRotateAngle(tail2, 0.0427F, 0.218F, 0.0092F);
        this.setRotateAngle(tail3, 0.0382F, -0.1308F, -0.005F);
        this.setRotateAngle(tail4, 0.1281F, -0.2164F, 0.5F);
        this.setRotateAngle(upperleg1, -0.7627F, 0.0F, 0.0F);
        this.setRotateAngle(lowerleg1, 1.216F, 0.0F, 0.0F);
        this.setRotateAngle(feet1, -0.33F, 0.0F, 0.0F);
        this.setRotateAngle(toes1, 0.2276F, 0.0F, 0.0F);
        this.setRotateAngle(upperleg2, -0.1082F, 0.0F, 0.0F);
        this.setRotateAngle(lowerleg2, 1.0414F, 0.0F, 0.0F);
        this.setRotateAngle(feet2, -1.0282F, 0.0F, 0.0F);
        this.setRotateAngle(toes2, 0.4458F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1328F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.4871F, -0.1327F, 0.0336F);
        this.setRotateAngle(neck2, -0.3774F, -0.4138F, -0.1728F);
        this.setRotateAngle(neck3, 0.0951F, -0.1701F, -0.3103F);
        this.setRotateAngle(head1, 0.2086F, -0.1281F, -0.027F);
        this.setRotateAngle(cube_r1, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(jaw1, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm1, 0.2599F, 0.0F, 0.0F);
        this.setRotateAngle(arms1, 0.4648F, 0.0F, 0.0F);
        this.setRotateAngle(hands1, 0.0F, 0.9599F, 0.0F);
        this.setRotateAngle(thumbclaw1, -0.7741F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm2, 0.4344F, 0.0F, 0.0F);
        this.setRotateAngle(arms2, 0.6829F, 0.0F, 0.0F);
        this.setRotateAngle(hands2, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(thumbclaw2, -0.7741F, 0.0F, 0.0F);
        this.chest.offsetY = -0F;
        this.root.offsetY = -0.13F;
        this.root.render(0.01F);
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
        //this.basin.offsetY = 0.25F;

        EntityPrehistoricFloraMussaurus Mussaurus = (EntityPrehistoricFloraMussaurus) e;
        float masterSpeed = Mussaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 6, neck1);
        this.faceTarget(f3, f4, 6, neck2);
        this.faceTarget(f3, f4, 6, head1);

        boolean isBaby = Mussaurus.getJuvenile();

        //Is a baby so is quadrapedal:
        if (isBaby) {
            this.head1.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.neck2.scaleChildren = true;
            this.neck1.scaleChildren = true;
            this.neck1.setScale(1.175F, 1.175F, 1.175F);
            this.neck2.setScale(1.175F, 1.175F, 1.175F);
            this.neck3.setScale(1.175F, 1.175F, 1.175F);
            this.head1.setScale(1.175F, 1.175F, 1.175F);

            this.upperleg1.rotateAngleX = (float) Math.toRadians(-61.2);
            this.lowerleg1.rotateAngleX = (float) Math.toRadians(74.67);
            this.feet1.rotateAngleX = (float) Math.toRadians(-23.91);
            this.feet1.offsetY = (float) Math.toRadians(-3.5);

            this.upperleg2.rotateAngleX = (float) Math.toRadians(-61.2);
            this.lowerleg2.rotateAngleX = (float) Math.toRadians(74.67);
            this.feet2.rotateAngleX = (float) Math.toRadians(-23.91);
            this.feet2.offsetY = (float) Math.toRadians(-3.5);

            this.body.rotateAngleX = (float) Math.toRadians(15.11);
            this.chest.rotateAngleX = (float) Math.toRadians(-9.89);

            this.upperarm1.rotateAngleX = (float) Math.toRadians(44.89);
            this.hands1.rotateAngleZ = (float) Math.toRadians(-75);
            this.hands1.rotateAngleY = (float) Math.toRadians(-85);

            this.upperarm2.rotateAngleX = (float) Math.toRadians(44.89);
            this.hands2.rotateAngleZ = (float) Math.toRadians(75);
            this.hands2.rotateAngleY = (float) Math.toRadians(85);

            //this.basin.offsetY = 0.4825F;
        }
        else {
            this.head1.scaleChildren = true;
            this.neck3.scaleChildren = true;
            this.neck2.scaleChildren = true;
            this.neck1.scaleChildren = true;
            this.neck1.setScale(1F, 1, 1F);
            this.neck2.setScale(1F, 1, 1F);
            this.neck3.setScale(1F, 1, 1F);
            this.head1.setScale(1F, 1, 1F);
        }


        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head1};

        AdvancedModelRenderer[] ArmL = {this.upperarm1, this.arms1};
        AdvancedModelRenderer[] ArmR = {this.upperarm2, this.arms2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Mussaurus.getAnimation() == Mussaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Mussaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Mussaurus.getIsMoving() || Mussaurus.getAnimation() == Mussaurus.STAND_ANIMATION) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F * 0.6F), 0.075F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F * 0.6F) * 2F, 0.0325F, 0.12F, f2, 1F);
                if (Mussaurus.getAnimation() != Mussaurus.DRINK_ANIMATION && !isBaby) {
                    this.chainWaveExtended(ArmL, 0.25F, 0.02F, 1.5, 8, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.25F, 0.02F, 1.5, 5, f2, 1F);
                }
                if (!isBaby) {
                    this.walk(body, 0.25F, 0.007F, false, 2.5F, 0, f2, 0.8F);
                    this.walk(chest, 0.25F, 0.015F, false, 2.5F, 0, f2, 0.8F);
                }
                return;
           }

            if (Mussaurus.getIsFast() && Mussaurus.getAnimation() != Mussaurus.STAND_ANIMATION) { //Running
                float speed = masterSpeed / 2.5F;
                if (isBaby) {
                    speed = speed * 1.5F;
                }
                //this.basin.offsetY = 0F;
                if (!isBaby) {
                    this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                    this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);
                }

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                if (!isBaby) {
                    this.walk(hands1, speed, 0.10F, true, 5, 0F, f2, 1F);
                    this.walk(hands2, speed, 0.10F, true, 2, 0F, f2, 1F);
                }

                this.walk(upperleg1, speed, 0.60F, true, 8, 0.55F, f2, 1F);
                this.walk(upperleg2, speed, 0.60F, true, 5, 0.55F, f2, 1F);

                this.walk(lowerleg1, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
                this.walk(lowerleg2, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);

                this.walk(feet1, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(feet2, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(toes1, speed, 0.85F, true, 7.5F, -0.2F, f2, 1F);
                this.walk(toes2, speed, 0.85F, true, 4.5F, -0.2F, f2, 1F);

                if (isBaby) {
                    this.walk(upperarm1, speed, 0.60F, true, 5, 0.55F, f2, 1F);
                    this.walk(upperarm2, speed, 0.60F, true, 8, 0.55F, f2, 1F);

                    this.walk(arms1, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);
                    this.walk(arms2, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);

                    this.walk(hands1, speed, 0.25F, true, 1, -0.18F, f2, 1F);
                    this.walk(hands2, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                }

                if (!isBaby) {
                    this.bobExtended(basin, speed * 2F, 0.5F, false, 2.5F, f2, 1F);
                }

                this.flap(basin, speed, 0.12F, false, 5.0F, 0.06F, f2, 1.0F);
                this.flap(body, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(chest, speed, -0.08F, false, 5.0F, -0.04F, f2, 1.0F);
                this.flap(neck1, speed, 0.08F, false, 5.0F, 0.04F, f2, 1.0F);

                this.flap(upperleg1, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(upperleg2, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);

                if (!isBaby) {
                    this.walk(body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                    this.walk(chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);
                }

                this.walk(neck1, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head1, speed * 2, 0.4F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

                if (!isBaby) {
                    this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1) + 0.2F;
                }
            }
            else if (Mussaurus.getAnimation() != Mussaurus.STAND_ANIMATION) { //Walking
                float speed = masterSpeed / 2.00F;
                if (isBaby) {
                    speed = speed * 1.5F;
                }
                //this.basin.offsetY = 0F;
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);

                if (!isBaby) {
                    this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                    this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                    this.walk(hands1, speed, 0.10F, true, 5, 0F, f2, 1F);
                    this.walk(hands2, speed, 0.10F, true, 2, 0F, f2, 1F);
                }

                this.walk(upperleg1, speed, 0.40F, true, 8, 0.35F, f2, 1F);
                this.walk(upperleg2, speed, 0.40F, true, 5, 0.35F, f2, 1F);

                this.walk(lowerleg1, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
                this.walk(lowerleg2, speed, 0.30F, true, 3.5F, 0F, f2, 1F);

                if (!isBaby) {
                    this.bobExtended(lowerleg1, speed, 1.5F, false, 7.0F, f2, 1F);
                    this.bobExtended(lowerleg2, speed, 1.5F, false, 4.0F, f2, 1F);
                }

                this.walk(feet1, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(feet2, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(toes1, speed, 0.5F, true, 5.0F, -0.25F, f2, 1F);
                this.walk(toes2, speed, 0.5F, true, 2.0F, -0.25F, f2, 1F);

                if (isBaby) {
                    this.walk(upperarm1, speed, 0.40F, true, 5, 0.35F, f2, 1F);
                    this.walk(upperarm2, speed, 0.40F, true, 8, 0.35F, f2, 1F);

                    this.walk(arms1, speed, 0.30F, true, 3.5F, 0F, f2, 1F);
                    this.walk(arms2, speed, 0.30F, true, 6.5F, 0F, f2, 1F);

                    this.walk(hands1, speed, 0.25F, true, 1, -0.18F, f2, 1F);
                    this.walk(hands2, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                }

                if (!isBaby) {
                    this.bobExtended(basin, speed * 2F, 0.25F, false, 3.5F, f2, 1F);
                }

                this.flap(basin, speed, 0.22F, false, 6.0F, 0.06F, f2, 1.0F);
                this.flap(body, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(chest, speed, -0.12F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(neck1, speed, 0.12F, false, 6.0F, 0.04F, f2, 1.0F);

                this.flap(upperleg1, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(upperleg2, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);

                if (!isBaby) {
                    this.walk(body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                    this.walk(chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);
                }

                this.walk(neck1, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head1, speed * 2, 0.4F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);

                if (!isBaby) {
                    this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.8), false, 1.75F, f2, 1) + 0.2F;
                }
            }
        }
        else {
            //Swimming pose:
            
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water

            return;

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMussaurus e = (EntityPrehistoricFloraMussaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.basin, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.basin, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.STAND_ANIMATION); //220 ticks!
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        //Swing1
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(20), (float) Math.toRadians(20));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Swing2
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(15), (float) Math.toRadians(30));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        //SwingB1
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(-20), (float) Math.toRadians(-20));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //SwingB2
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(-15), (float) Math.toRadians(-30));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(20);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(10);
        animator.move(this.neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck1, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(5);

        animator.setAnimation(e.DRINK_ANIMATION); //160 ticks
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Swing1
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Swing2
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //SwingB1
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //SwingB2
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

    }
}
