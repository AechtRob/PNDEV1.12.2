package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRhynchonkos;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRhynchonkos extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodymiddlefront;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neckunderside;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lowerjawback;
    private final AdvancedModelRenderer lowerjawleftmiddle;
    private final AdvancedModelRenderer lowerjawrightmiddle;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftupperarm;
    private final AdvancedModelRenderer leftlowerarm;
    private final AdvancedModelRenderer leftfrontfoot;
    private final AdvancedModelRenderer rightupperarm;
    private final AdvancedModelRenderer rightlowerarm;
    private final AdvancedModelRenderer rightfrontfoot;
    private final AdvancedModelRenderer bodymiddleback;
    private final AdvancedModelRenderer bodyback;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer hipsunderside;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailmiddle;
    private final AdvancedModelRenderer tailmiddleend;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer leftthigh;
    private final AdvancedModelRenderer leftshin;
    private final AdvancedModelRenderer lefthindfoot;
    private final AdvancedModelRenderer rightthigh;
    private final AdvancedModelRenderer rightshin;
    private final AdvancedModelRenderer righthindfoot;


    private ModelAnimator animator;

    public ModelRhynchonkos() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.0F, 9.0F);


        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -1.2F, -9.0F);
        this.root.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 0, 26, -1.0F, -0.5F, -2.0F, 2, 2, 4, 0.0F, true));

        this.bodymiddlefront = new AdvancedModelRenderer(this);
        this.bodymiddlefront.setRotationPoint(-0.01F, 0.0F, -1.5F);
        this.bodymiddle.addChild(bodymiddlefront);
        this.setRotateAngle(bodymiddlefront, 0.0424F, 0.0F, 0.0F);
        this.bodymiddlefront.cubeList.add(new ModelBox(bodymiddlefront, 13, 27, -1.0F, -0.5F, -3.0F, 2, 2, 3, 0.0F, true));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.01F, 0.0F, -2.5F);
        this.bodymiddlefront.addChild(bodyfront);
        this.setRotateAngle(bodyfront, 0.0424F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 19, -1.0F, -0.5F, -4.0F, 2, 2, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.01F, 0.0F, -3.7F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, 0.0637F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 21, 19, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, true));

        this.neckunderside = new AdvancedModelRenderer(this);
        this.neckunderside.setRotationPoint(-0.01F, -0.1F, -1.9F);
        this.neck.addChild(neckunderside);
        this.setRotateAngle(neckunderside, -0.2335F, 0.0F, 0.0F);
        this.neckunderside.cubeList.add(new ModelBox(neckunderside, 18, 14, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.01F, 0.0F, -1.6F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.1485F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 5, -1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F, true));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(-1.0F, -0.5F, -1.0F);
        this.head.addChild(leftcheek);
        this.setRotateAngle(leftcheek, 0.0637F, -0.2759F, -0.0105F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 6, 0, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(0.98F, 0.49F, -0.9F);
        this.leftcheek.addChild(lefteye);
        this.setRotateAngle(lefteye, 0.0F, 0.0F, 0.0213F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 29, 7, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, -0.43F, -2.05F);
        this.head.addChild(snout);
        this.setRotateAngle(snout, 0.0848F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 15, 12, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(1.0F, -0.5F, -1.0F);
        this.head.addChild(rightcheek);
        this.setRotateAngle(rightcheek, 0.0637F, 0.2759F, 0.0105F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 13, 0, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-0.98F, 0.49F, -0.9F);
        this.rightcheek.addChild(righteye);
        this.setRotateAngle(righteye, 0.0F, 0.0F, -0.0213F);
        this.righteye.cubeList.add(new ModelBox(righteye, 29, 10, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.lowerjawback = new AdvancedModelRenderer(this);
        this.lowerjawback.setRotationPoint(0.01F, 0.1F, 0.01F);
        this.head.addChild(lowerjawback);
        this.lowerjawback.cubeList.add(new ModelBox(lowerjawback, 7, 5, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, true));

        this.lowerjawleftmiddle = new AdvancedModelRenderer(this);
        this.lowerjawleftmiddle.setRotationPoint(-0.9F, 1.0F, -1.0F);
        this.lowerjawback.addChild(lowerjawleftmiddle);
        this.setRotateAngle(lowerjawleftmiddle, -0.0424F, -0.2546F, 0.0F);
        this.lowerjawleftmiddle.cubeList.add(new ModelBox(lowerjawleftmiddle, 30, 4, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.lowerjawrightmiddle = new AdvancedModelRenderer(this);
        this.lowerjawrightmiddle.setRotationPoint(0.9F, 1.0F, -1.0F);
        this.lowerjawback.addChild(lowerjawrightmiddle);
        this.setRotateAngle(lowerjawrightmiddle, -0.0424F, 0.2546F, 0.0F);
        this.lowerjawrightmiddle.cubeList.add(new ModelBox(lowerjawrightmiddle, 30, 1, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, -0.04F, -1.71F);
        this.lowerjawback.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, 0.0637F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 1, 0, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.leftupperarm = new AdvancedModelRenderer(this);
        this.leftupperarm.setRotationPoint(-0.6F, 0.9F, -3.0F);
        this.bodyfront.addChild(leftupperarm);
        this.setRotateAngle(leftupperarm, 0.1274F, 0.4033F, 0.3183F);
        this.leftupperarm.cubeList.add(new ModelBox(leftupperarm, 19, 3, -1.9F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftlowerarm = new AdvancedModelRenderer(this);
        this.leftlowerarm.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.leftupperarm.addChild(leftlowerarm);
        this.setRotateAngle(leftlowerarm, -0.9339F, -0.0637F, 0.0F);
        this.leftlowerarm.cubeList.add(new ModelBox(leftlowerarm, 14, 4, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.leftfrontfoot = new AdvancedModelRenderer(this);
        this.leftfrontfoot.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.leftlowerarm.addChild(leftfrontfoot);
        this.setRotateAngle(leftfrontfoot, -0.5732F, 0.3821F, -0.0424F);
        this.leftfrontfoot.cubeList.add(new ModelBox(leftfrontfoot, 25, 3, -1.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.rightupperarm = new AdvancedModelRenderer(this);
        this.rightupperarm.setRotationPoint(0.6F, 0.9F, -3.0F);
        this.bodyfront.addChild(rightupperarm);
        this.setRotateAngle(rightupperarm, 0.1274F, -0.4033F, -0.3183F);
        this.rightupperarm.cubeList.add(new ModelBox(rightupperarm, 19, 6, -0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.rightlowerarm = new AdvancedModelRenderer(this);
        this.rightlowerarm.setRotationPoint(1.4F, 0.0F, 0.0F);
        this.rightupperarm.addChild(rightlowerarm);
        this.setRotateAngle(rightlowerarm, -0.9339F, 0.0637F, 0.0F);
        this.rightlowerarm.cubeList.add(new ModelBox(rightlowerarm, 14, 8, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightfrontfoot = new AdvancedModelRenderer(this);
        this.rightfrontfoot.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.rightlowerarm.addChild(rightfrontfoot);
        this.setRotateAngle(rightfrontfoot, -0.5732F, -0.3821F, 0.0424F);
        this.rightfrontfoot.cubeList.add(new ModelBox(rightfrontfoot, 25, 5, -1.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, true));

        this.bodymiddleback = new AdvancedModelRenderer(this);
        this.bodymiddleback.setRotationPoint(0.01F, 0.0F, 1.5F);
        this.bodymiddle.addChild(bodymiddleback);
        this.setRotateAngle(bodymiddleback, -0.0424F, 0.0F, 0.0F);
        this.bodymiddleback.cubeList.add(new ModelBox(bodymiddleback, 0, 12, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, true));

        this.bodyback = new AdvancedModelRenderer(this);
        this.bodyback.setRotationPoint(-0.01F, 0.0F, 3.5F);
        this.bodymiddleback.addChild(bodyback);
        this.setRotateAngle(bodyback, -0.0637F, 0.0F, 0.0F);
        this.bodyback.cubeList.add(new ModelBox(bodyback, 13, 21, -1.0F, -0.5F, 0.0F, 2, 2, 3, 0.0F, true));

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.01F, 0.0F, 2.5F);
        this.bodyback.addChild(hips);
        this.setRotateAngle(hips, -0.0848F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 10, 16, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F, true));

        this.hipsunderside = new AdvancedModelRenderer(this);
        this.hipsunderside.setRotationPoint(0.01F, 0.8F, 3.1F);
        this.hips.addChild(hipsunderside);
        this.setRotateAngle(hipsunderside, 0.2122F, 0.0F, 0.0F);
        this.hipsunderside.cubeList.add(new ModelBox(hipsunderside, 24, 28, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.hips.addChild(tailbase);
        this.setRotateAngle(tailbase, -0.0424F, 0.0F, 0.0F);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 9, 12, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tailmiddle = new AdvancedModelRenderer(this);
        this.tailmiddle.setRotationPoint(-0.01F, 0.0F, 1.7F);
        this.tailbase.addChild(tailmiddle);
        this.setRotateAngle(tailmiddle, 0.1274F, 0.0F, 0.0F);
        this.tailmiddle.cubeList.add(new ModelBox(tailmiddle, 0, 8, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tailmiddleend = new AdvancedModelRenderer(this);
        this.tailmiddleend.setRotationPoint(0.01F, 0.0F, 1.7F);
        this.tailmiddle.addChild(tailmiddleend);
        this.setRotateAngle(tailmiddleend, 0.0637F, 0.0F, 0.0F);
        this.tailmiddleend.cubeList.add(new ModelBox(tailmiddleend, 7, 8, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(-0.01F, 0.0F, 1.7F);
        this.tailmiddleend.addChild(tailend);
        this.setRotateAngle(tailend, 0.0424F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 23, 23, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.leftthigh = new AdvancedModelRenderer(this);
        this.leftthigh.setRotationPoint(-0.6F, 0.4F, 1.5F);
        this.hips.addChild(leftthigh);
        this.setRotateAngle(leftthigh, -0.0848F, -0.6156F, 0.4033F);
        this.leftthigh.cubeList.add(new ModelBox(leftthigh, 25, 13, -1.9F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftshin = new AdvancedModelRenderer(this);
        this.leftshin.setRotationPoint(-1.4F, 0.0F, 0.0F);
        this.leftthigh.addChild(leftshin);
        this.setRotateAngle(leftshin, 0.1274F, -0.3609F, 0.0424F);
        this.leftshin.cubeList.add(new ModelBox(leftshin, 19, 9, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.lefthindfoot = new AdvancedModelRenderer(this);
        this.lefthindfoot.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.leftshin.addChild(lefthindfoot);
        this.setRotateAngle(lefthindfoot, -0.4458F, 0.9128F, -0.7854F);
        this.lefthindfoot.cubeList.add(new ModelBox(lefthindfoot, 18, 0, -1.0F, 0.0F, -1.9F, 2, 0, 2, 0.0F, true));

        this.rightthigh = new AdvancedModelRenderer(this);
        this.rightthigh.setRotationPoint(0.6F, 0.4F, 1.5F);
        this.hips.addChild(rightthigh);
        this.setRotateAngle(rightthigh, -0.0848F, 0.6156F, -0.4033F);
        this.rightthigh.cubeList.add(new ModelBox(rightthigh, 27, 16, -0.1F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

        this.rightshin = new AdvancedModelRenderer(this);
        this.rightshin.setRotationPoint(1.4F, 0.0F, 0.0F);
        this.rightthigh.addChild(rightshin);
        this.setRotateAngle(rightshin, 0.1274F, 0.3609F, -0.0424F);
        this.rightshin.cubeList.add(new ModelBox(rightshin, 24, 9, -0.5F, -0.1F, -0.5F, 1, 2, 1, 0.0F, true));

        this.righthindfoot = new AdvancedModelRenderer(this);
        this.righthindfoot.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.rightshin.addChild(righthindfoot);
        this.setRotateAngle(righthindfoot, -0.4458F, -0.9128F, 0.7854F);
        this.righthindfoot.cubeList.add(new ModelBox(righthindfoot, 23, 0, -1.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(bodymiddlefront, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(bodyfront, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(head, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(bodymiddleback, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(bodyback, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(hips, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tailbase, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tailmiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tailmiddleend, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tailend, 0.0F, 0.2F, 0.0F);
        this.root.offsetY = 0.198F;
        this.root.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -1.338F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.resetToDefaultPose();
        this.root.offsetZ = -0.0F;

        EntityPrehistoricFloraRhynchonkos Rhynchonkos = (EntityPrehistoricFloraRhynchonkos) e;

        this.faceTarget(f3, f4, 16, head);
        AdvancedModelRenderer[] Tail = {this.tailbase, this.tailmiddle, this.tailmiddleend, this.tailend};
        Rhynchonkos.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRhynchonkos ee = (EntityPrehistoricFloraRhynchonkos) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            } else {
                animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            }
        }
        else {

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhynchonkos entity = (EntityPrehistoricFloraRhynchonkos) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -4.75 + (((tickAnim - 3) / 5) * (-11-(-4.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11 + (((tickAnim - 8) / 2) * (0-(-11)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 9.75 + (((tickAnim - 3) / 5) * (6-(9.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 8) / 2) * (0-(6)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 24.75 + (((tickAnim - 3) / 2) * (0-(24.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (16-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 16 + (((tickAnim - 8) / 2) * (0-(16)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjawback, lowerjawback.rotateAngleX + (float) Math.toRadians(xx), lowerjawback.rotateAngleY + (float) Math.toRadians(yy), lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));
       

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRhynchonkos entity = (EntityPrehistoricFloraRhynchonkos) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 15) / 5) * (0-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 25) / 5) * (0-(5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 35) / 5) * (0-(5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (5-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 45) / 5) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodymiddlefront, bodymiddlefront.rotateAngleX + (float) Math.toRadians(xx), bodymiddlefront.rotateAngleY + (float) Math.toRadians(yy), bodymiddlefront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 15) / 5) * (0-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 25) / 5) * (0-(5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 35) / 5) * (0-(5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (5-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 45) / 5) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 10) / 35) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 35) * (-3-(-3)));
            zz = 0 + (((tickAnim - 10) / 35) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -3 + (((tickAnim - 45) / 5) * (0-(-3)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 10) / 35) * (0-(0)));
            yy = -13 + (((tickAnim - 10) / 35) * (-13-(-13)));
            zz = 0 + (((tickAnim - 10) / 35) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = -13 + (((tickAnim - 45) / 5) * (0-(-13)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.75 + (((tickAnim - 10) / 5) * (-12.5-(-0.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -12.5 + (((tickAnim - 15) / 5) * (-0.75-(-12.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -0.75 + (((tickAnim - 20) / 5) * (-12.5-(-0.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -12.5 + (((tickAnim - 25) / 5) * (-0.75-(-12.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = -0.75 + (((tickAnim - 30) / 5) * (-12.5-(-0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -12.5 + (((tickAnim - 35) / 5) * (-0.75-(-12.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -0.75 + (((tickAnim - 40) / 5) * (-12.5-(-0.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -12.5 + (((tickAnim - 45) / 5) * (0-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (66.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.75 + (((tickAnim - 10) / 5) * (35.51359-(-11.75)));
            yy = 66.25 + (((tickAnim - 10) / 5) * (-29.1738-(66.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (-30.54297-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 35.51359 + (((tickAnim - 15) / 3) * (12.3249-(35.51359)));
            yy = -29.1738 + (((tickAnim - 15) / 3) * (21.36658-(-29.1738)));
            zz = -30.54297 + (((tickAnim - 15) / 3) * (-23.30011-(-30.54297)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 12.3249 + (((tickAnim - 18) / 2) * (-11.75-(12.3249)));
            yy = 21.36658 + (((tickAnim - 18) / 2) * (66.25-(21.36658)));
            zz = -23.30011 + (((tickAnim - 18) / 2) * (0-(-23.30011)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.75 + (((tickAnim - 20) / 5) * (35.51359-(-11.75)));
            yy = 66.25 + (((tickAnim - 20) / 5) * (-29.1738-(66.25)));
            zz = 0 + (((tickAnim - 20) / 5) * (-30.54297-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 35.51359 + (((tickAnim - 25) / 3) * (12.3249-(35.51359)));
            yy = -29.1738 + (((tickAnim - 25) / 3) * (21.36658-(-29.1738)));
            zz = -30.54297 + (((tickAnim - 25) / 3) * (-23.30011-(-30.54297)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.3249 + (((tickAnim - 28) / 2) * (-11.75-(12.3249)));
            yy = 21.36658 + (((tickAnim - 28) / 2) * (66.25-(21.36658)));
            zz = -23.30011 + (((tickAnim - 28) / 2) * (0-(-23.30011)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -11.75 + (((tickAnim - 30) / 5) * (35.51359-(-11.75)));
            yy = 66.25 + (((tickAnim - 30) / 5) * (-29.1738-(66.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (-30.54297-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 35.51359 + (((tickAnim - 35) / 3) * (12.3249-(35.51359)));
            yy = -29.1738 + (((tickAnim - 35) / 3) * (21.36658-(-29.1738)));
            zz = -30.54297 + (((tickAnim - 35) / 3) * (-23.30011-(-30.54297)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 12.3249 + (((tickAnim - 38) / 2) * (-11.75-(12.3249)));
            yy = 21.36658 + (((tickAnim - 38) / 2) * (66.25-(21.36658)));
            zz = -23.30011 + (((tickAnim - 38) / 2) * (0-(-23.30011)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -11.75 + (((tickAnim - 40) / 5) * (35.51359-(-11.75)));
            yy = 66.25 + (((tickAnim - 40) / 5) * (-29.1738-(66.25)));
            zz = 0 + (((tickAnim - 40) / 5) * (-30.54297-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 35.51359 + (((tickAnim - 45) / 3) * (12.3249-(35.51359)));
            yy = -29.1738 + (((tickAnim - 45) / 3) * (21.36658-(-29.1738)));
            zz = -30.54297 + (((tickAnim - 45) / 3) * (-23.30011-(-30.54297)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 12.3249 + (((tickAnim - 48) / 2) * (0-(12.3249)));
            yy = 21.36658 + (((tickAnim - 48) / 2) * (0-(21.36658)));
            zz = -23.30011 + (((tickAnim - 48) / 2) * (0-(-23.30011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.62811-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-53.8488-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.45857-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6.62811 + (((tickAnim - 10) / 5) * (64.02891-(6.62811)));
            yy = -53.8488 + (((tickAnim - 10) / 5) * (12.2637-(-53.8488)));
            zz = -9.45857 + (((tickAnim - 10) / 5) * (-32.54519-(-9.45857)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 64.02891 + (((tickAnim - 15) / 3) * (42.83916-(64.02891)));
            yy = 12.2637 + (((tickAnim - 15) / 3) * (-26.15575-(12.2637)));
            zz = -32.54519 + (((tickAnim - 15) / 3) * (-42.88592-(-32.54519)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 42.83916 + (((tickAnim - 18) / 2) * (6.62811-(42.83916)));
            yy = -26.15575 + (((tickAnim - 18) / 2) * (-53.8488-(-26.15575)));
            zz = -42.88592 + (((tickAnim - 18) / 2) * (-9.45857-(-42.88592)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 6.62811 + (((tickAnim - 20) / 5) * (64.02891-(6.62811)));
            yy = -53.8488 + (((tickAnim - 20) / 5) * (12.2637-(-53.8488)));
            zz = -9.45857 + (((tickAnim - 20) / 5) * (-32.54519-(-9.45857)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 64.02891 + (((tickAnim - 25) / 3) * (42.83916-(64.02891)));
            yy = 12.2637 + (((tickAnim - 25) / 3) * (-26.15575-(12.2637)));
            zz = -32.54519 + (((tickAnim - 25) / 3) * (-42.88592-(-32.54519)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 42.83916 + (((tickAnim - 28) / 2) * (6.62811-(42.83916)));
            yy = -26.15575 + (((tickAnim - 28) / 2) * (-53.8488-(-26.15575)));
            zz = -42.88592 + (((tickAnim - 28) / 2) * (-9.45857-(-42.88592)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 6.62811 + (((tickAnim - 30) / 5) * (64.02891-(6.62811)));
            yy = -53.8488 + (((tickAnim - 30) / 5) * (12.2637-(-53.8488)));
            zz = -9.45857 + (((tickAnim - 30) / 5) * (-32.54519-(-9.45857)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 64.02891 + (((tickAnim - 35) / 3) * (42.83916-(64.02891)));
            yy = 12.2637 + (((tickAnim - 35) / 3) * (-26.15575-(12.2637)));
            zz = -32.54519 + (((tickAnim - 35) / 3) * (-42.88592-(-32.54519)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 42.83916 + (((tickAnim - 38) / 2) * (6.62811-(42.83916)));
            yy = -26.15575 + (((tickAnim - 38) / 2) * (-53.8488-(-26.15575)));
            zz = -42.88592 + (((tickAnim - 38) / 2) * (-9.45857-(-42.88592)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 6.62811 + (((tickAnim - 40) / 5) * (64.02891-(6.62811)));
            yy = -53.8488 + (((tickAnim - 40) / 5) * (12.2637-(-53.8488)));
            zz = -9.45857 + (((tickAnim - 40) / 5) * (-32.54519-(-9.45857)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 64.02891 + (((tickAnim - 45) / 3) * (42.83916-(64.02891)));
            yy = 12.2637 + (((tickAnim - 45) / 3) * (-26.15575-(12.2637)));
            zz = -32.54519 + (((tickAnim - 45) / 3) * (-42.88592-(-32.54519)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 42.83916 + (((tickAnim - 48) / 2) * (0-(42.83916)));
            yy = -26.15575 + (((tickAnim - 48) / 2) * (0-(-26.15575)));
            zz = -42.88592 + (((tickAnim - 48) / 2) * (0-(-42.88592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 10) / 5) * (56.5-(7.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 56.5 + (((tickAnim - 15) / 3) * (87.13-(56.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 87.13 + (((tickAnim - 18) / 2) * (7.75-(87.13)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 7.75 + (((tickAnim - 20) / 5) * (56.5-(7.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 56.5 + (((tickAnim - 25) / 3) * (87.13-(56.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 87.13 + (((tickAnim - 28) / 2) * (7.75-(87.13)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 30) / 5) * (56.5-(7.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 56.5 + (((tickAnim - 35) / 3) * (87.13-(56.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 87.13 + (((tickAnim - 38) / 2) * (7.75-(87.13)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 7.75 + (((tickAnim - 40) / 5) * (56.5-(7.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 56.5 + (((tickAnim - 45) / 3) * (87.13-(56.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 87.13 + (((tickAnim - 48) / 2) * (0-(87.13)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraRhynchonkos entity = (EntityPrehistoricFloraRhynchonkos) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.20029 + (((tickAnim - 0) / 3) * (3.83905-(24.20029)));
            yy = -17.10013 + (((tickAnim - 0) / 3) * (-49.984-(-17.10013)));
            zz = 18.17245 + (((tickAnim - 0) / 3) * (1.9298-(18.17245)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.83905 + (((tickAnim - 3) / 5) * (42.30905-(3.83905)));
            yy = -49.984 + (((tickAnim - 3) / 5) * (27.3361-(-49.984)));
            zz = 1.9298 + (((tickAnim - 3) / 5) * (26.5517-(1.9298)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 42.30905 + (((tickAnim - 8) / 2) * (24.20029-(42.30905)));
            yy = 27.3361 + (((tickAnim - 8) / 2) * (-17.10013-(27.3361)));
            zz = 26.5517 + (((tickAnim - 8) / 2) * (18.17245-(26.5517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 48.8501 + (((tickAnim - 0) / 2) * (57.92505-(48.8501)));
            yy = -34.2723 + (((tickAnim - 0) / 2) * (-17.13615-(-34.2723)));
            zz = -3.95194 + (((tickAnim - 0) / 2) * (-1.97597-(-3.95194)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 57.92505 + (((tickAnim - 2) / 1) * (0-(57.92505)));
            yy = -17.13615 + (((tickAnim - 2) / 1) * (0-(-17.13615)));
            zz = -1.97597 + (((tickAnim - 2) / 1) * (0-(-1.97597)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (21.24686-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (37.07692-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-12.3089-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 21.24686 + (((tickAnim - 6) / 2) * (45.85159-(21.24686)));
            yy = 37.07692 + (((tickAnim - 6) / 2) * (-9.16025-(37.07692)));
            zz = -12.3089 + (((tickAnim - 6) / 2) * (1.58795-(-12.3089)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 45.85159 + (((tickAnim - 8) / 2) * (48.8501-(45.85159)));
            yy = -9.16025 + (((tickAnim - 8) / 2) * (-34.2723-(-9.16025)));
            zz = 1.58795 + (((tickAnim - 8) / 2) * (-3.95194-(1.58795)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.68549 + (((tickAnim - 0) / 3) * (42.30905-(16.68549)));
            yy = 7.2552 + (((tickAnim - 0) / 3) * (-27.3361-(7.2552)));
            zz = 3.38033 + (((tickAnim - 0) / 3) * (-26.5517-(3.38033)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 42.30905 + (((tickAnim - 3) / 2) * (21.40235-(42.30905)));
            yy = -27.3361 + (((tickAnim - 3) / 2) * (17.88483-(-27.3361)));
            zz = -26.5517 + (((tickAnim - 3) / 2) * (-17.07403-(-26.5517)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 21.40235 + (((tickAnim - 5) / 2) * (-7.73738-(21.40235)));
            yy = 17.88483 + (((tickAnim - 5) / 2) * (67.90138-(17.88483)));
            zz = -17.07403 + (((tickAnim - 5) / 2) * (-2.32641-(-17.07403)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -7.73738 + (((tickAnim - 7) / 3) * (16.68549-(-7.73738)));
            yy = 67.90138 + (((tickAnim - 7) / 3) * (7.2552-(67.90138)));
            zz = -2.32641 + (((tickAnim - 7) / 3) * (3.38033-(-2.32641)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.38454 + (((tickAnim - 0) / 3) * (56.09915-(15.38454)));
            yy = -48.41871 + (((tickAnim - 0) / 3) * (-8.6715-(-48.41871)));
            zz = -9.12627 + (((tickAnim - 0) / 3) * (-28.48759-(-9.12627)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 56.09915 + (((tickAnim - 3) / 2) * (13.56674-(56.09915)));
            yy = -8.6715 + (((tickAnim - 3) / 2) * (-54.38526-(-8.6715)));
            zz = -28.48759 + (((tickAnim - 3) / 2) * (-33.81367-(-28.48759)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 13.56674 + (((tickAnim - 5) / 1) * (-30.23732-(13.56674)));
            yy = -54.38526 + (((tickAnim - 5) / 1) * (-37.01981-(-54.38526)));
            zz = -33.81367 + (((tickAnim - 5) / 1) * (5.70317-(-33.81367)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -30.23732 + (((tickAnim - 6) / 1) * (-9.18496-(-30.23732)));
            yy = -37.01981 + (((tickAnim - 6) / 1) * (-38.83856-(-37.01981)));
            zz = 5.70317 + (((tickAnim - 6) / 1) * (-2.04433-(5.70317)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -9.18496 + (((tickAnim - 7) / 3) * (15.38454-(-9.18496)));
            yy = -38.83856 + (((tickAnim - 7) / 3) * (-48.41871-(-38.83856)));
            zz = -2.04433 + (((tickAnim - 7) / 3) * (-9.12627-(-2.04433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.69087 + (((tickAnim - 0) / 5) * (58.00976-(11.69087)));
            yy = -0.9098 + (((tickAnim - 0) / 5) * (49.36-(-0.9098)));
            zz = -14.04971 + (((tickAnim - 0) / 5) * (11.3249-(-14.04971)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 58.00976 + (((tickAnim - 5) / 2) * (16.07353-(58.00976)));
            yy = 49.36 + (((tickAnim - 5) / 2) * (8.1206-(49.36)));
            zz = 11.3249 + (((tickAnim - 5) / 2) * (6.62485-(11.3249)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 16.07353 + (((tickAnim - 7) / 1) * (12.36169-(16.07353)));
            yy = 8.1206 + (((tickAnim - 7) / 1) * (-29.70117-(8.1206)));
            zz = 6.62485 + (((tickAnim - 7) / 1) * (-19.37488-(6.62485)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12.36169 + (((tickAnim - 8) / 2) * (11.69087-(12.36169)));
            yy = -29.70117 + (((tickAnim - 8) / 2) * (-0.9098-(-29.70117)));
            zz = -19.37488 + (((tickAnim - 8) / 2) * (-14.04971-(-19.37488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 25.25 + (((tickAnim - 0) / 5) * (0-(25.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (34.75-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 34.75 + (((tickAnim - 7) / 1) * (29-(34.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 29 + (((tickAnim - 8) / 2) * (25.25-(29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -104.99347 + (((tickAnim - 0) / 5) * (0-(-104.99347)));
            yy = 19.89977 + (((tickAnim - 0) / 5) * (0-(19.89977)));
            zz = -126.999 + (((tickAnim - 0) / 5) * (0-(-126.999)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (160.12196-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (22.76416-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (92.95076-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 160.12196 + (((tickAnim - 7) / 1) * (-34.97604-(160.12196)));
            yy = 22.76416 + (((tickAnim - 7) / 1) * (9.48878-(22.76416)));
            zz = 92.95076 + (((tickAnim - 7) / 1) * (-51.74872-(92.95076)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -34.97604 + (((tickAnim - 8) / 2) * (-104.99347-(-34.97604)));
            yy = 9.48878 + (((tickAnim - 8) / 2) * (19.89977-(9.48878)));
            zz = -51.74872 + (((tickAnim - 8) / 2) * (-126.999-(-51.74872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.05 + (((tickAnim - 0) / 5) * (0-(-0.05)));
            yy = 0.125 + (((tickAnim - 0) / 5) * (0-(0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.275-(0)));
            zz = -0.575 + (((tickAnim - 7) / 1) * (0-(-0.575)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.05-(0)));
            yy = 0.275 + (((tickAnim - 8) / 2) * (0.125-(0.275)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(xx);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(yy);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 58.00976 + (((tickAnim - 0) / 2) * (26.20113-(58.00976)));
            yy = -49.35997 + (((tickAnim - 0) / 2) * (-3.41651-(-49.35997)));
            zz = -11.3249 + (((tickAnim - 0) / 2) * (-6.75341-(-11.3249)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 26.20113 + (((tickAnim - 2) / 2) * (5.9892-(26.20113)));
            yy = -3.41651 + (((tickAnim - 2) / 2) * (25.18282-(-3.41651)));
            zz = -6.75341 + (((tickAnim - 2) / 2) * (12.07216-(-6.75341)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5.9892 + (((tickAnim - 4) / 6) * (58.00976-(5.9892)));
            yy = 25.18282 + (((tickAnim - 4) / 6) * (-49.35997-(25.18282)));
            zz = 12.07216 + (((tickAnim - 4) / 6) * (-11.3249-(12.07216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-40))*10), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*5));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*0.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0), bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*15), bodymiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodymiddlefront, bodymiddlefront.rotateAngleX + (float) Math.toRadians(0), bodymiddlefront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*10), bodymiddlefront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+170))*10), bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+250))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+390))*-10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 17.94528 + (((tickAnim - 0) / 2) * (-51.25524-(17.94528)));
            yy = 44.51751 + (((tickAnim - 0) / 2) * (31.04051-(44.51751)));
            zz = 24.1532 + (((tickAnim - 0) / 2) * (-26.92505-(24.1532)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -51.25524 + (((tickAnim - 2) / 1) * (-12.13873-(-51.25524)));
            yy = 31.04051 + (((tickAnim - 2) / 1) * (28.2518-(31.04051)));
            zz = -26.92505 + (((tickAnim - 2) / 1) * (-3.8528-(-26.92505)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12.13873 + (((tickAnim - 3) / 5) * (54.73865-(-12.13873)));
            yy = 28.2518 + (((tickAnim - 3) / 5) * (2.33948-(28.2518)));
            zz = -3.8528 + (((tickAnim - 3) / 5) * (30.00262-(-3.8528)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 54.73865 + (((tickAnim - 8) / 2) * (17.94528-(54.73865)));
            yy = 2.33948 + (((tickAnim - 8) / 2) * (44.51751-(2.33948)));
            zz = 30.00262 + (((tickAnim - 8) / 2) * (24.1532-(30.00262)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -19.63141 + (((tickAnim - 0) / 3) * (-1.00404-(-19.63141)));
            yy = -6.5479 + (((tickAnim - 0) / 3) * (-30.08817-(-6.5479)));
            zz = 19.50932 + (((tickAnim - 0) / 3) * (16.04779-(19.50932)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -1.00404 + (((tickAnim - 3) / 0) * (52.54622-(-1.00404)));
            yy = -30.08817 + (((tickAnim - 3) / 0) * (17.35524-(-30.08817)));
            zz = 16.04779 + (((tickAnim - 3) / 0) * (-0.24367-(16.04779)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 52.54622 + (((tickAnim - 3) / 2) * (93.21147-(52.54622)));
            yy = 17.35524 + (((tickAnim - 3) / 2) * (10.76271-(17.35524)));
            zz = -0.24367 + (((tickAnim - 3) / 2) * (15.27307-(-0.24367)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 93.21147 + (((tickAnim - 5) / 1) * (48.35573-(93.21147)));
            yy = 10.76271 + (((tickAnim - 5) / 1) * (5.38136-(10.76271)));
            zz = 15.27307 + (((tickAnim - 5) / 1) * (7.63653-(15.27307)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 48.35573 + (((tickAnim - 6) / 1) * (0-(48.35573)));
            yy = 5.38136 + (((tickAnim - 6) / 1) * (0-(5.38136)));
            zz = 7.63653 + (((tickAnim - 6) / 1) * (0-(7.63653)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (-19.63141-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-6.5479-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (19.50932-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bodymiddleback, bodymiddleback.rotateAngleX + (float) Math.toRadians(0), bodymiddleback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), bodymiddleback.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyback, bodyback.rotateAngleX + (float) Math.toRadians(0), bodyback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*10), bodyback.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), hips.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(0), tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-160))*10), tailbase.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(0), tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-170))*10), tailmiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(0), tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*10), tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(0), tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-240))*10), tailend.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-33.89-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = -33.89 + (((tickAnim - 2) / 2) * (-29-(-33.89)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = -29 + (((tickAnim - 4) / 6) * (0-(-29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (160.12196-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-22.7642-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-92.9508-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 160.12196 + (((tickAnim - 2) / 2) * (-34.97604-(160.12196)));
            yy = -22.7642 + (((tickAnim - 2) / 2) * (-9.4888-(-22.7642)));
            zz = -92.9508 + (((tickAnim - 2) / 2) * (51.7487-(-92.9508)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -34.97604 + (((tickAnim - 4) / 6) * (0-(-34.97604)));
            yy = -9.4888 + (((tickAnim - 4) / 6) * (0-(-9.4888)));
            zz = 51.7487 + (((tickAnim - 4) / 6) * (0-(51.7487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.575-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = -0.575 + (((tickAnim - 2) / 2) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);
       

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraRhynchonkos entity = (EntityPrehistoricFloraRhynchonkos) entitylivingbaseIn;
        int animCycle = 20;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 24.20029 + (((tickAnim - 0) / 6) * (3.83905-(24.20029)));
            yy = -17.10013 + (((tickAnim - 0) / 6) * (-49.984-(-17.10013)));
            zz = 18.17245 + (((tickAnim - 0) / 6) * (1.9298-(18.17245)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 3.83905 + (((tickAnim - 6) / 10) * (42.30905-(3.83905)));
            yy = -49.984 + (((tickAnim - 6) / 10) * (27.3361-(-49.984)));
            zz = 1.9298 + (((tickAnim - 6) / 10) * (26.5517-(1.9298)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 42.30905 + (((tickAnim - 16) / 4) * (24.20029-(42.30905)));
            yy = 27.3361 + (((tickAnim - 16) / 4) * (-17.10013-(27.3361)));
            zz = 26.5517 + (((tickAnim - 16) / 4) * (18.17245-(26.5517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftupperarm, leftupperarm.rotateAngleX + (float) Math.toRadians(xx), leftupperarm.rotateAngleY + (float) Math.toRadians(yy), leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 48.8501 + (((tickAnim - 0) / 3) * (57.92505-(48.8501)));
            yy = -34.2723 + (((tickAnim - 0) / 3) * (-17.13615-(-34.2723)));
            zz = -3.95194 + (((tickAnim - 0) / 3) * (-1.97597-(-3.95194)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 57.92505 + (((tickAnim - 3) / 3) * (0-(57.92505)));
            yy = -17.13615 + (((tickAnim - 3) / 3) * (0-(-17.13615)));
            zz = -1.97597 + (((tickAnim - 3) / 3) * (0-(-1.97597)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (21.24686-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (37.07692-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (-12.3089-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 21.24686 + (((tickAnim - 11) / 5) * (45.85159-(21.24686)));
            yy = 37.07692 + (((tickAnim - 11) / 5) * (-9.16025-(37.07692)));
            zz = -12.3089 + (((tickAnim - 11) / 5) * (1.58795-(-12.3089)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 45.85159 + (((tickAnim - 16) / 4) * (48.8501-(45.85159)));
            yy = -9.16025 + (((tickAnim - 16) / 4) * (-34.2723-(-9.16025)));
            zz = 1.58795 + (((tickAnim - 16) / 4) * (-3.95194-(1.58795)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfrontfoot, leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 16.68549 + (((tickAnim - 0) / 6) * (42.30905-(16.68549)));
            yy = 7.2552 + (((tickAnim - 0) / 6) * (-27.3361-(7.2552)));
            zz = 3.38033 + (((tickAnim - 0) / 6) * (-26.5517-(3.38033)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 42.30905 + (((tickAnim - 6) / 4) * (21.40235-(42.30905)));
            yy = -27.3361 + (((tickAnim - 6) / 4) * (17.88483-(-27.3361)));
            zz = -26.5517 + (((tickAnim - 6) / 4) * (-17.07403-(-26.5517)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 21.40235 + (((tickAnim - 10) / 3) * (3.83905-(21.40235)));
            yy = 17.88483 + (((tickAnim - 10) / 3) * (49.98402-(17.88483)));
            zz = -17.07403 + (((tickAnim - 10) / 3) * (-1.92981-(-17.07403)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.83905 + (((tickAnim - 13) / 7) * (16.68549-(3.83905)));
            yy = 49.98402 + (((tickAnim - 13) / 7) * (7.2552-(49.98402)));
            zz = -1.92981 + (((tickAnim - 13) / 7) * (3.38033-(-1.92981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightupperarm, rightupperarm.rotateAngleX + (float) Math.toRadians(xx), rightupperarm.rotateAngleY + (float) Math.toRadians(yy), rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.38454 + (((tickAnim - 0) / 6) * (37.09915-(15.38454)));
            yy = -48.41871 + (((tickAnim - 0) / 6) * (-8.6715-(-48.41871)));
            zz = -9.12627 + (((tickAnim - 0) / 6) * (-28.48759-(-9.12627)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 37.09915 + (((tickAnim - 6) / 4) * (2.545-(37.09915)));
            yy = -8.6715 + (((tickAnim - 6) / 4) * (-43.25424-(-8.6715)));
            zz = -28.48759 + (((tickAnim - 6) / 4) * (-18.39173-(-28.48759)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.545 + (((tickAnim - 10) / 2) * (-30.23732-(2.545)));
            yy = -43.25424 + (((tickAnim - 10) / 2) * (-37.01981-(-43.25424)));
            zz = -18.39173 + (((tickAnim - 10) / 2) * (5.70317-(-18.39173)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -30.23732 + (((tickAnim - 12) / 1) * (-12.13873-(-30.23732)));
            yy = -37.01981 + (((tickAnim - 12) / 1) * (-28.2518-(-37.01981)));
            zz = 5.70317 + (((tickAnim - 12) / 1) * (3.8528-(5.70317)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -12.13873 + (((tickAnim - 13) / 7) * (15.38454-(-12.13873)));
            yy = -28.2518 + (((tickAnim - 13) / 7) * (-48.41871-(-28.2518)));
            zz = 3.8528 + (((tickAnim - 13) / 7) * (-9.12627-(3.8528)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerarm, rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 10.91631 + (((tickAnim - 0) / 9) * (58.00976-(10.91631)));
            yy = 10.76675 + (((tickAnim - 0) / 9) * (49.36-(10.76675)));
            zz = -12.52441 + (((tickAnim - 0) / 9) * (11.3249-(-12.52441)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 58.00976 + (((tickAnim - 9) / 4) * (16.07353-(58.00976)));
            yy = 49.36 + (((tickAnim - 9) / 4) * (8.1206-(49.36)));
            zz = 11.3249 + (((tickAnim - 9) / 4) * (6.62485-(11.3249)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 16.07353 + (((tickAnim - 13) / 3) * (11.25206-(16.07353)));
            yy = 8.1206 + (((tickAnim - 13) / 3) * (-24.98578-(8.1206)));
            zz = 6.62485 + (((tickAnim - 13) / 3) * (-18.12626-(6.62485)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 11.25206 + (((tickAnim - 16) / 4) * (10.91631-(11.25206)));
            yy = -24.98578 + (((tickAnim - 16) / 4) * (10.76675-(-24.98578)));
            zz = -18.12626 + (((tickAnim - 16) / 4) * (-12.52441-(-18.12626)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftthigh, leftthigh.rotateAngleX + (float) Math.toRadians(xx), leftthigh.rotateAngleY + (float) Math.toRadians(yy), leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 25.25 + (((tickAnim - 0) / 9) * (0-(25.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (34.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 34.75 + (((tickAnim - 13) / 3) * (29-(34.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 29 + (((tickAnim - 16) / 4) * (25.25-(29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftshin, leftshin.rotateAngleX + (float) Math.toRadians(xx), leftshin.rotateAngleY + (float) Math.toRadians(yy), leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -104.99347 + (((tickAnim - 0) / 9) * (0-(-104.99347)));
            yy = 19.89977 + (((tickAnim - 0) / 9) * (0-(19.89977)));
            zz = -126.999 + (((tickAnim - 0) / 9) * (0-(-126.999)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (160.12196-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (22.76416-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (92.95076-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 160.12196 + (((tickAnim - 13) / 3) * (-34.97604-(160.12196)));
            yy = 22.76416 + (((tickAnim - 13) / 3) * (9.48878-(22.76416)));
            zz = 92.95076 + (((tickAnim - 13) / 3) * (-51.74872-(92.95076)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -34.97604 + (((tickAnim - 16) / 4) * (-104.99347-(-34.97604)));
            yy = 9.48878 + (((tickAnim - 16) / 4) * (19.89977-(9.48878)));
            zz = -51.74872 + (((tickAnim - 16) / 4) * (-126.999-(-51.74872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthindfoot, lefthindfoot.rotateAngleX + (float) Math.toRadians(xx), lefthindfoot.rotateAngleY + (float) Math.toRadians(yy), lefthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.575-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = -0.575 + (((tickAnim - 13) / 3) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthindfoot.rotationPointX = this.lefthindfoot.rotationPointX + (float)(xx);
        this.lefthindfoot.rotationPointY = this.lefthindfoot.rotationPointY - (float)(yy);
        this.lefthindfoot.rotationPointZ = this.lefthindfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 58.00976 + (((tickAnim - 0) / 3) * (26.20113-(58.00976)));
            yy = -49.35997 + (((tickAnim - 0) / 3) * (-3.41651-(-49.35997)));
            zz = -11.3249 + (((tickAnim - 0) / 3) * (-6.75341-(-11.3249)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 26.20113 + (((tickAnim - 3) / 5) * (11.25206-(26.20113)));
            yy = -3.41651 + (((tickAnim - 3) / 5) * (24.9858-(-3.41651)));
            zz = -6.75341 + (((tickAnim - 3) / 5) * (18.1263-(-6.75341)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 11.25206 + (((tickAnim - 8) / 12) * (58.00976-(11.25206)));
            yy = 24.9858 + (((tickAnim - 8) / 12) * (-49.35997-(24.9858)));
            zz = 18.1263 + (((tickAnim - 8) / 12) * (-11.3249-(18.1263)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightthigh, rightthigh.rotateAngleX + (float) Math.toRadians(xx), rightthigh.rotateAngleY + (float) Math.toRadians(yy), rightthigh.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*3), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.5);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(bodymiddle, bodymiddle.rotateAngleX + (float) Math.toRadians(0), bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*10), bodymiddle.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));


        this.setRotateAngle(bodymiddlefront, bodymiddlefront.rotateAngleX + (float) Math.toRadians(0), bodymiddlefront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5), bodymiddlefront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+170))*10), bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+390))*-10), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.94528 + (((tickAnim - 0) / 3) * (-51.25524-(17.94528)));
            yy = 44.51751 + (((tickAnim - 0) / 3) * (31.04051-(44.51751)));
            zz = 24.1532 + (((tickAnim - 0) / 3) * (-26.92505-(24.1532)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -51.25524 + (((tickAnim - 3) / 3) * (-12.13873-(-51.25524)));
            yy = 31.04051 + (((tickAnim - 3) / 3) * (28.2518-(31.04051)));
            zz = -26.92505 + (((tickAnim - 3) / 3) * (-3.8528-(-26.92505)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = -12.13873 + (((tickAnim - 6) / 10) * (31.7543-(-12.13873)));
            yy = 28.2518 + (((tickAnim - 6) / 10) * (12.83705-(28.2518)));
            zz = -3.8528 + (((tickAnim - 6) / 10) * (30.22941-(-3.8528)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 31.7543 + (((tickAnim - 16) / 4) * (17.94528-(31.7543)));
            yy = 12.83705 + (((tickAnim - 16) / 4) * (44.51751-(12.83705)));
            zz = 30.22941 + (((tickAnim - 16) / 4) * (24.1532-(30.22941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerarm, leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -19.63141 + (((tickAnim - 0) / 4) * (-1.00404-(-19.63141)));
            yy = -6.5479 + (((tickAnim - 0) / 4) * (-30.08817-(-6.5479)));
            zz = 19.50932 + (((tickAnim - 0) / 4) * (16.04779-(19.50932)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -1.00404 + (((tickAnim - 4) / 2) * (29.57274-(-1.00404)));
            yy = -30.08817 + (((tickAnim - 4) / 2) * (0.13097-(-30.08817)));
            zz = 16.04779 + (((tickAnim - 4) / 2) * (0.72777-(16.04779)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 29.57274 + (((tickAnim - 6) / 4) * (63.71147-(29.57274)));
            yy = 0.13097 + (((tickAnim - 6) / 4) * (10.76271-(0.13097)));
            zz = 0.72777 + (((tickAnim - 6) / 4) * (15.27307-(0.72777)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 63.71147 + (((tickAnim - 10) / 2) * (48.35573-(63.71147)));
            yy = 10.76271 + (((tickAnim - 10) / 2) * (5.38136-(10.76271)));
            zz = 15.27307 + (((tickAnim - 10) / 2) * (7.63653-(15.27307)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 48.35573 + (((tickAnim - 12) / 1) * (0-(48.35573)));
            yy = 5.38136 + (((tickAnim - 12) / 1) * (0-(5.38136)));
            zz = 7.63653 + (((tickAnim - 12) / 1) * (0-(7.63653)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-19.63141-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-6.5479-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (19.50932-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfrontfoot, rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(bodymiddleback, bodymiddleback.rotateAngleX + (float) Math.toRadians(0), bodymiddleback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*10), bodymiddleback.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(bodyback, bodyback.rotateAngleX + (float) Math.toRadians(0), bodyback.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), bodyback.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), hips.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailbase, tailbase.rotateAngleX + (float) Math.toRadians(0), tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*10), tailbase.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailmiddle, tailmiddle.rotateAngleX + (float) Math.toRadians(0), tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*10), tailmiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailmiddleend, tailmiddleend.rotateAngleX + (float) Math.toRadians(0), tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*10), tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(0), tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*10), tailend.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-33.89-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -33.89 + (((tickAnim - 3) / 5) * (-29-(-33.89)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -29 + (((tickAnim - 8) / 12) * (0-(-29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightshin, rightshin.rotateAngleX + (float) Math.toRadians(xx), rightshin.rotateAngleY + (float) Math.toRadians(yy), rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (160.12196-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-22.7642-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-92.9508-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 160.12196 + (((tickAnim - 3) / 5) * (-34.97604-(160.12196)));
            yy = -22.7642 + (((tickAnim - 3) / 5) * (-9.4888-(-22.7642)));
            zz = -92.9508 + (((tickAnim - 3) / 5) * (51.7487-(-92.9508)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -34.97604 + (((tickAnim - 8) / 12) * (0-(-34.97604)));
            yy = -9.4888 + (((tickAnim - 8) / 12) * (0-(-9.4888)));
            zz = 51.7487 + (((tickAnim - 8) / 12) * (0-(51.7487)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthindfoot, righthindfoot.rotateAngleX + (float) Math.toRadians(xx), righthindfoot.rotateAngleY + (float) Math.toRadians(yy), righthindfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.575-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.575 + (((tickAnim - 3) / 5) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthindfoot.rotationPointX = this.righthindfoot.rotationPointX + (float)(xx);
        this.righthindfoot.rotationPointY = this.righthindfoot.rotationPointY - (float)(yy);
        this.righthindfoot.rotationPointZ = this.righthindfoot.rotationPointZ + (float)(zz);
       

    }

    

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjawback, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
